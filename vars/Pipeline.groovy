def call(String configYaml){
    try {
        pipeline {
            agent {
                docker {
                    image 'maven:3-alpine'  
                }
            }
            tools{
                jdk
            }
            stages {
                stage('Welcome') {
                    steps {
                        script { 
                            log.info 'Starting'
                        }  
                        sayHello 'Nicolò'
                        //sayHello configYaml
                    }
                }
                stage("Project Configuration"){
                    steps {
                        //configuration(this, configYaml)
                        //echo "Pipeline ${env.PIPELINE_VERSION}"
                        paramInEnv(this)
                        echo "Language ${env.LANGUAGE}"
                        echo "Pipeline Version ${env.PIPELINE_VERSION}"
                    }
                }
                stage('Info') {
                    steps {
                        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                    }
                }
                stage('Build') { 
                    steps {
                    	echo "Build"
                        //sh 'mvn -B -DskipTests clean package' 
                    }
                }
                stage('Test') {
                    steps {
                    	echo "Test"
                        //sh 'mvn test'
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
        }
    }
    catch(e) {
        echo "Error Happened ${e}"
    }
}
