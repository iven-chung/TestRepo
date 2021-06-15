pipeline{
	agent any
	environment {
		NEW_VERSION = '1.0.3'
	}
	stages {
		stage("Build"){
			steps{
				echo 'Building my application'
				echo "Building version ${NEW_VERSION}"
			}
		}
		stage("Test"){
			steps{
				echo 'Testing my application'
			}
		}
		stage("Deploy"){
			steps{
				echo 'Deploying my application'
			}
		}
	}
	post{
		always{
			echo 'This is the end of the pipeline'
		}
	}
	
}
