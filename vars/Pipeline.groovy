def call(){

    try {
        pipeline {
            agent any {
            
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
                        println GlobalVars.foo
                    }
                }
                stage('Stage 3'){
                    steps {
                        script { 
                            log.warning 'Nothing to do!'
                        }   
                    }
                }
            }
        }
    }
    finally {
        echo ""
    }
    
}
