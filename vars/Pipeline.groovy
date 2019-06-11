def call(){

    try {
        pipeline {
            agent {
                docker {
                    image 'maven:3-alpine' 
                    args '-v /root/.m2:/root/.m2' 
                }
            }
            stages {
                stage('Stage 1') {
                    steps {
                        script { 
                            log.info 'Starting'
                        }  
                        sayHello 'Nicolò'
                    }
                }
                stage('Stage 2') {
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
                stage('Stage 3'){
                    steps {
                        script { 
                            log.warning 'Nothing more to do!'
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
    }
    finally {
        echo ""
    }
}
