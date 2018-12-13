package config.steps

def checkoutFrom() {
    git([url: "git@bitbucket.org:TracePharm/tracepharmservices.git", branch: "master"])
}
return this

def artifactoryConfig() {
    def server = Artifactory.newServer url: 'http://artifactory.trph.ru/artifactory', username: 'artifactory', password: 'Ieraipah1thu'
    def rtMaven = Artifactory.newMavenBuild()
    rtMaven.tool = "maven"
    buildInfo = Artifactory.newBuildInfo()
    rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'
}
return this
