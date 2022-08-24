pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh 'git update-index --chmod=+x ./gradlew'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
}