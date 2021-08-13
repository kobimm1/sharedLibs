def respoonse1
def respoonse2

def call (name){
  echo "Hey ${name}, How are you?"
  getBuildNumber()
  getBuildURL()
  getRespoonse()
  printRespoonse()
}

def getBuildNumber(){
  echo "${env.CUSTOME_MESSAGE}"
 echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"
}

def getBuildURL(){
  echo "${env.BUILD_URL}"
}

def getRespoonse(String prompt1 = 'Please enter your data', String prompt2 = 'Please enter your data') {
       def resp = input message: '<message>', parameters: [string(defaultValue: '',
       description: prompt1, name: 'RESPONSE1'), string(defaultValue: '', description: prompt2, name: 'RESPONSE2')]
        echo "${resp.RESPONSE1}"
        echo "${resp.RESPONSE2}"
        respoonse1 = resp.RESPONSE1
        respoonse1 = resp.RESPONSE2
       }
def printRespoonse(){
  echo """user response1 = ${respoonse1} 
          user response2 = ${respoonse2}       
       """
}

