#!groovy

node ('test_label') {
    stages {
        stage('Build') {
	    sh 'echo stage BUILD'
	    sh 'sleep 1m'
	}
	stage('test') {
	    sh 'echo stage TEST'
	    sh 'sleep 1m'
	}
    }	
}
