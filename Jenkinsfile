pipeline{
	agent any
	stages {
		stage("Build"){
			steps{
				echo 'Building my application'
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
