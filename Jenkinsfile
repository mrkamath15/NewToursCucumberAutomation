pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                bat "mvn clean test"
            }
            post {
                success {
                                        cucumber buildStatus: 'null',
                                        customCssFiles: '',
                                        customJsFiles: '',
                                        failedFeaturesNumber: -1,
                                        failedScenariosNumber: -1,
                                        failedStepsNumber: -1,
                                        fileIncludePattern: '**/*.json',
                						reportTitle: 'New Tours Cucumber Automation',
                                        pendingStepsNumber: -1,
                                        skippedStepsNumber: -1,
                                        sortingMethod: 'ALPHABETICAL',
                                        undefinedStepsNumber: -1
                                }
            }
         }
    }
}
