pipeline { 
    agent any 

    tools { 
        maven 'Maven' // Make sure "Maven" is the exact name configured in Jenkins > Global Tool Configuration
    } 

    stages { 
        stage('Checkout') {  
            steps { 
                git branch: 'main', url: 'https://github.com/Abhilash676/hello.git'
            } 
        } 

        stage('Build') {  
            steps { 
                bat 'mvn clean package'  
            } 
        } 

        stage('Test') {  
            steps { 
                bat 'mvn test'  
            } 
        } 

        stage('Run Application') {  
            steps { 
                bat 'java -jar target/pror2-0.0.1-SNAPSHOT.jar'  // Replace with actual JAR name if different
            } 
        } 
    } 
}
