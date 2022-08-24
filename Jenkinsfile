pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh 'git update-index --chmod=+x gradlew'
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle clean test'
            }
        }
    }
}