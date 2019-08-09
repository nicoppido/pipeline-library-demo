def call(){
    try {
        pipeline {
            agent {
                docker {
                    image 'maven:3-alpine'  
                }
            }
            stages {
                stage('Welcome') {
                    steps{
                        Welcome(this);
                    }
                }
                stage('Build') {
                    steps{
                        Build(this);
                    }
                }
            }
        }
    }
    catch(e) {
        echo "Error Happened ${e}"
    }
}
