pipeline {

    agent any

    stages {

        stage('build'){
            steps {
                sh 'whoami'
                sh './gradlew build -x test '
            }
        }

        stage('test') {
            steps {
                sh './gradlew clean test'
            }
            post {
                success {
//                     cucumber buildStatus: 'Serenity Tests', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                    publishHTML([ allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        includes: '**/**/**.*',
                        keepAll: false, reportDir:
                        'target/site/serenity',
                        reportFiles: 'index.html',
                        reportName: 'Serenity Report',
                        reportTitles: ''
                        ]
                    )
                }
                unsuccessful {
//                     cucumber buildStatus: 'Serenity Tests', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                    publishHTML([ allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        includes: '**/**/**.*',
                        keepAll: false, reportDir:
                        'target/site/serenity',
                        reportFiles: 'index.html',
                        reportName: 'Serenity Report',
                        reportTitles: ''
                    ]
                    )
                }
            }
        }

    }
}