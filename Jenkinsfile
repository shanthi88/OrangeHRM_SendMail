pipeline {
   agent any

   stages {
      stage('Build') 
	{
         steps 
	{
            echo "Building the code....."
	    bat "mvn clean"
         }
	}
      stage('Test') 
	{
         steps 
	{
          git 'https://github.com/shanthi88/OrangeHRM_SendMail.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            //echo "Testing the code....."
	    //bat "mvn test"
         }
	}

      stage('Compile') 
	{
         steps 
	{
            echo "Compiling the code....."
	    bat "mvn compile"
         }
	}
}
}
