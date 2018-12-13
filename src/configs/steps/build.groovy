package config.steps

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

def dockerBuild(String serviceName, String workspace) {
//    servicePom = new XmlSlurper().parse(new File("${workspace}/${serviceName}/pom.xml"))
//    serviceVersion = servicePom.version

    sh "docker build --pull --build-arg SERVICE_NAME=srv-auth -t docker.trph.ru/srv-auth:test srv-auth"
}
//    sh "docker push docker.trph.ru/${serviceName}:${serviceVersion}"

def setEnv(workspace, serviceName, deployHost) {
    def project = new XmlSlurper().parse(new File("${workspace}/${serviceName}/pom.xml"))
    env.SERVICE = serviceName
    env.HOST_NAME = deployHost

    if (debug == "true"){
       env.DEBUG_OPTS = service.DEBUG_OPTS
    }
}
