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
                sh 'mvn spring-boot:build-image'
            }
        }
    }
}
