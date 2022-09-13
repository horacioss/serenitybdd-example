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
            post {
                success {
                    publishHTML target: [
                            reportName : 'Serenity',
                            reportDir:   'target/site/serenity',
                            reportFiles: 'index.html',
                            keepAll:     true,
                            alwaysLinkToLastBuild: true,
                            allowMissing: false
                    ]
                }
            }
        }

    }
}