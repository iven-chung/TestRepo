def groovy

pipeline{
	agent any
	environment {
		NEW_VERSION = '1.3.0'
	}
	parameters{
		choice(name: 'VERSION', choices: ['1.0.0', '1.1.0', '1.2.0'], description: 'Please select version')
		booleanParam(name: 'IncludeTests', defaultValue: true, description: '')
	}
	stages {
		stage("Init"){
			steps{
				script{
					groovy = load "script.groovy"
				}
			}
		}
		stage("Build"){
			steps{
				echo 'Building my application'
				echo "Building version ${NEW_VERSION}"
			}
		}
		stage("Test"){
			when{
				expression{
					params.InvokeTests == true
				}
			}
			steps{
				echo 'Testing my application'
			}
		}
		stage("Deploy"){
			steps{
				script{
					groovy.deployApp()
				}
			}
		}
	}
	post{
		always{
			echo 'This is the end of the pipeline'
		}
	}
	
}
