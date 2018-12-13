package config.steps

def checkoutFrom() {
    git([url: "git@bitbucket.org:TracePharm/tracepharmservices.git", branch: "master"])
}
    
return this
