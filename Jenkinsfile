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
        stage('Docker run image') {
            steps {
                sh 'docker run -d -p 8085:8085 --name test aniketmr9/linode-jenkins-test'
            }
        }        
    }
}
