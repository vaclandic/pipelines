package config.steps

class Build {
    def checkoutFrom(repo="tracepharmservices.git", branch="master") {
        git([url: "git@bitbucket.org:TracePharm/${repo}", branch: "${branch}"])
        return this
    }
    
    def runArtifactory() {
        rtMaven.tool = "maven"
        buildInfo = Artifactory.newBuildInfo()
        rtMaven.deployer server: server, releaseRepo: 'artifactory', snapshotRepo: 'artifactory'
    }
}
