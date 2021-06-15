pipeline{
	agent any
	//ENV VARIABLE
	environment {
		NEW_VERSION= '1.0.0'
	}
	stages {
		stage("build") {
			steps {
				echo 'building the application'
				echo "building version ${NEW+VERSION}"
			}
		}
		stage("test") {
			steps {
				echo 'Test the application'
			}
		}
		stage("deploy") {
			steps {
				echo 'Deploy the application'
			}
		}
	}
}
