pipeline {
    agent any

    stages {
        stage('Assemble project') {
            steps {
                git branch: 'master',
                url: 'https://github.com/aniketmr9/linode-jenkins-test.git'
            }
        }
        stage('Run unit test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Maven build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build') {
            steps {
                sh 'docker build -t aniketmr9/linode-jenkins-test:latest .'
            }
        }
        /*stage('Docker run image') {
            steps {
                sh 'docker run -d -p 8085:8085 --name test aniketmr9/linode-jenkins-test'
            }
        }   */
        stage('Docker run image') {
            steps {
                sh '''if [ ! "$(docker ps -q -f name=test)" ]; then
                    if [ "$(docker ps -aq -f status=exited -f name=test)" ]; then
                        # cleanup
                        docker rm test
                    fi
                    # run your container
                    docker run -d -p 8085:8085 --name test aniketmr9/linode-jenkins-test
                fi'''
            }
        }        
    }
}
