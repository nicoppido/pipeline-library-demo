def call(){
    try {
        pipeline {
            agent {
                docker {
                    image 'maven:3-alpine'  
                }
            }
            tools{
                jdk version
            }
            stages {
                stage('Welcome') {
                    steps{
                        Welcome(this);
                    }
                }
            }
        }
    }
    catch(e) {
        echo "Error Happened ${e}"
    }
}
