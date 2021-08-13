def call (name){
  echo "Hey ${name}, How are you?"
  getBuildNumber()
}

def getBuildNumber(){
  echo "${env.CUSTOME_MESSAGE}"
 echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"
}
