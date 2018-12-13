package config.steps

class Build {
    def checkoutFrom() {
        git([url: "git@bitbucket.org:TracePharm/tracepharmservices.git", branch: "master"])
        return this
    }
    
    def runArtifactory() {
        rtMaven.tool = "maven"
        buildInfo = Artifactory.newBuildInfo()
        rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'
    }
}
