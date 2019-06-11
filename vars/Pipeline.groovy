def call(String configYaml){
    try {
        pipeline {
            agent {
                docker {
                    image 'maven:3-alpine'  
                }
            }
            stages {
                stage('Welcome') {
                    steps {
                        script { 
                            log.info 'Starting'
                        }  
                        sayHello 'Nicolò'
                    }
                }
                stage("Project Configuration"){
                    steps {
                        configuration(this, configYaml)
                    }
                }
                stage('Info') {
                    steps {
                        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                    }
                }
                stage('Build') { 
                    steps {
                        sh 'mvn -B -DskipTests clean package' 
                    }
                }
                stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }
                stage('Close'){
                    steps {
                        script { 
                            log.warning 'Nothing more to do!'
                        }   
                    }
                }
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
    finally {
        echo ""
    }
}
