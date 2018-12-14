package config.steps

import groovy.json.JsonSlurper

def checkoutFrom(repo, branch) {
    git([url: "git@bitbucket.org:TracePharm/${repo}", branch: "${branch}"])
}

def buildAndPush(java_version="10", serviceName) {
    def server = Artifactory.newServer url: 'http://artifactory.trph.ru/artifactory', username: 'artifactory', password: 'Ieraipah1thu'
    def rtMaven = Artifactory.newMavenBuild()
    env.JAVA_HOME="/jdk${java_version}"

    rtMaven.tool = "maven"
    buildInfo = Artifactory.newBuildInfo()
    rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'

    rtMaven.run pom: "${serviceName}/pom.xml" as String, goals: "-U clean install -Dmaven.test.skip=true -s /home/jenkins/settings.xml", buildInfo: buildInfo
    server.publishBuildInfo buildInfo
    rtMaven.deployer.deployArtifacts buildInfo
}

def parsePom(serviceName, workspace) {
    def servicePom = new XmlSlurper().parse(new File("${workspace}/${serviceName}/pom.xml"))
    serviceVersion = servicePom.version.text()
    return serviceVersion
}

def dockerBuild(serviceName, serviceVersion) {
    sh "docker build --pull --build-arg SERVICE_NAME=${serviceName} -t docker.trph.ru/${serviceName}:${serviceVersion} ${serviceName}"
    sh "docker push docker.trph.ru/${serviceName}:${serviceVersion}"
}

def registryRequest(serviceName) {
    def url = "http://docker.trph.ru/v2/${serviceName}/tags/list"
    URL tagsUrl = url.toURL()
    HashMap tagsJson = new JsonSlurper().parse(tagsUrl.newReader())
    List response = tagsJson.tags
    return response
}

def deployService(serviceName, serviceVersion, environment, deployStructure, debug=false) {
    env.SERVICE = serviceName
    env.HOST_NAME = deployStructure[environment]['deploy_servers'] 
    env.STAGE = deployStructure[environment]['stage']
    env.CPU_LIMIT = deployStructure[environment]['cpu_limit']
    env.MEMORY_LIMIT = deployStructure[environment]['memory_limit']
    env.APP_VERSION = "${serviceVersion}"
    
    if (debug == "true"){
       env.DEBUG_OPTS = deployStructure[environment]['debug_opts'] 
    }
    sh "erb ${serviceName}/nomad.plan.erb > ${serviceName}/nomad.plan"
    sh "nomad stop ${serviceName}-${environment} || exit 0"
    sh "nomad run ${serviceName}/nomad.plan"
}
