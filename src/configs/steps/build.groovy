package config.steps

class Build {
    def checkoutFrom(repo=tracepharmservices, branch=master) {
        git([url: "git@bitbucket.org:TracePharm/${repo}.git", branch: "${branch}"])
    }
    
    def runArtifactory() {
        rtMaven.tool = "maven"
        buildInfo = Artifactory.newBuildInfo()
        rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'
    }
}
