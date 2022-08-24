pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh 'git update-index --chmod=+x ./gradlew'
                sh 'git add .'
                sh 'git commit -m "Changing permission of gradlew"'
                sh 'git push'
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