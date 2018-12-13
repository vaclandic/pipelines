package config.steps


def checkoutFrom(repo, branch) {
    git([url: "git@bitbucket.org:TracePharm/${repo}", branch: "${branch}"])
    return this
}

def mvnBuild(java_version="10", serviceName) {
    def server = Artifactory.newServer url: 'http://artifactory.trph.ru/artifactory', username: 'artifactory', password: 'Ieraipah1thu'
    def rtMaven = Artifactory.newMavenBuild()
    env.JAVA_HOME="/jdk${java_version}"

    rtMaven.tool = "maven"
    buildInfo = Artifactory.newBuildInfo()
    rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'

    rtMaven.run pom: "${serviceName}/pom.xml" as String, goals: "-U clean install -Dmaven.test.skip=true -s /home/jenkins/settings.xml", buildInfo: buildInfo
    return this
}

def pullArtifact() {
    def server = Artifactory.newServer url: 'http://artifactory.trph.ru/artifactory', username: 'artifactory', password: 'Ieraipah1thu'
    def rtMaven = Artifactory.newMavenBuild()

    rtMaven.tool = "maven"
    buildInfo = Artifactory.newBuildInfo()
    rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'

    server.publishBuildInfo buildInfo
    rtMaven.deployer.deployArtifacts buildInfo
    return this
}

def setEnv(workspace, serviceName, deployHost) {
    def project = new XmlSlurper().parse(new File("${workspace}/${serviceName}/pom.xml"))
    env.SERVICE = serviceName
    env.HOST_NAME = deployHost

    if (debug == "true"){
       env.DEBUG_OPTS = service.DEBUG_OPTS
    }
    return this
}
