pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk8'
        git 'git'
    }
    stages {
        stage ('git clone') {
            steps {
                git url: 'https://github.com/NikoleK/selenium-cucumber-java.git'
            }
        }
        stage ('run tests') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}