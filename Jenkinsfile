pipeline {
    agent any

    stages {
        stage('build'){
            steps {
                sh './gradlew build -x test '
            }
        }
        stage('test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
}