def call(String configYaml, String version){
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
                    Welcome(this);
                }
            }
        }
    }
    catch(e) {
        echo "Error Happened ${e}"
    }
}
