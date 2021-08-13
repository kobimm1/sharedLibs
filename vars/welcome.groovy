def call (name){
  echo "Hey ${name}, How are you?"
  getBuildNumber()
  getBuildURL()
}

def getBuildNumber(){
  echo "${env.CUSTOME_MESSAGE}"
 echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"
}

def getBuildURL(){
  echo "${env.BUILD_URL}"
}
