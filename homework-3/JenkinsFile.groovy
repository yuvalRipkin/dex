pipeline {
    agent any

    environment {
        IMAGE_NAME = 'yuvalripkin/hw-3'
        DOCKERFILE_PATH = '/home/yuval-ripkin/hw/Dockerfile'
        CONTEXT_PATH = '/home/yuval-ripkin/hw'
        DOCKER_CREDENTIALS_ID = 'docker-hub-credentials'
    }

    stages {
        stage('Build and Push Docker Image') {
            steps {
                script {
                    sh "docker build -t ${IMAGE_NAME} -f ${DOCKERFILE_PATH} ${CONTEXT_PATH}"
                    docker.withRegistry('https://index.docker.io/v1/', DOCKER_CREDENTIALS_ID) {
                        sh "docker tag ${IMAGE_NAME} ${IMAGE_NAME}:latest"
                        sh "docker push ${IMAGE_NAME}:latest"
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Build and push succeeded!'
        }
        failure {
            echo 'Build or push failed.'
        }
    }
}
