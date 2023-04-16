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
            jsonReportDirectory: '**/cucumber.json',
            pendingStepsNumber: -1,
            reportTitle: 'New Tours Cucumber Automation',
            skippedStepsNumber: -1,
            sortingMethod: 'ALPHABETICAL',
            undefinedStepsNumber: -1
            }
            }
         }
    }
}