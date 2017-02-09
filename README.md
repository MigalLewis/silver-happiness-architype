# silver-happiness-architype
This is an architype for silver-happiness

DomainServiceArchitype

#####################################
#   Running Architype locally       #
#####################################
In directory that you want to save architype run
    
    git clone https://github.com/MigalLewis/silver-happiness-architype.git

In project directory clean and install to local repository
    
    mvn clean install 

run architype to generate project

#################################
#   To Run                      #
#################################

    mvn archetype:generate -DarchetypeGroupId=za.co.migal -DarchetypeArtifactId=silver-happiness-architype -DarchetypeVersion=1.0-SNAPSHOT -DartifactId=$projectName_ -DgroupId=$projectPackage_

$projectName_ - the name of your project eg. customer
$projectPackage_ - the package for your project eg. com.sbg.domain

It will create a project in the following structure

$projectName_
|-- $projectName_-module
    |-- pom.xml
    `-- src
        |-- main
            |--java
                |-- $projectPackage_
                    |-- model
                    `-- exceptions
                    `-- $projectName_Module.java
|-- $projectName_-module-za
    |-- pom.xml
    `-- src
        |-- main
            |-- java
                |-- $projectPackage_
                    |-- za
                        |-- $projectName_ModuleImpl.java
                        `-- beanconfig
                            |-- BeanConfig.java
                            `-- SouthAfrica.java
        |-- test
            |-- java
            |-- resources
                |-- config.properties
|-- $projectName_-service
    |-- pom.xml
    `-- src
        |-- main
            |-- java
                |-- $projectPackage_
                    |-- Application.java
                    `-- beansconfig
                        `-- SecurityConfig.java
                        `-- SwaggerConfig.java
                    `-- controller
                        |-- $projectName_Controller.java
            `-- resources
                |-- application.properties

#####################################
#   Health check                    #
#####################################

#####################################
#   Sonar                           #
#####################################

  Token
silver-happiness
5c9cef59c2b17c7ff349d3cdf2e75d9c83c47481

  Run
mvn sonar:sonar \
    -Dsonar.host.url=https://sonarqube.com \
    -Dsonar.login=5c9cef59c2b17c7ff349d3cdf2e75d9c83c47481

