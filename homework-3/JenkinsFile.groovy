pipeline {
    agent any

    environment {
        DOCKER_CREDENTIALS_ID = 'docker-hub-credentials'
        DOCKER_IMAGE_NAME = yuvalripkin/hw-3'
        DOCKER_IMAGE_TAG = '1.0' 
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    def customImage = docker.build("${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}")
                }
            }
        }

        stage('Login to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', "${DOCKER_CREDENTIALS_ID}") {
                    }
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.image("${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}").push()
                }
            }
        }
    }

    post {
        success {
            echo 'Docker image built and pushed successfully!'
        }
        failure {
            echo 'An error occurred during the pipeline execution.'
        }
    }
}
