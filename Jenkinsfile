pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat '''
                	mvn package
                	mvn install
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}