def buildApp(){
  echo 'Building the application'
}

def buildApp(){
  echo 'Testing the application'
}

def buildApp(){
  echo 'Deploying the application'
  echo "Deploying version ${params.VERSION}"
}

return this
