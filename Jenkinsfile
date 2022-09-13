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
                    cucumber buildStatus: 'Serenity Tests', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: './build/cucumber-reports/json/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                }
                unsuccessful {
                    cucumber buildStatus: 'Serenity Tests', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: './build/cucumber-reports/json/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                }
            }
        }

    }
}