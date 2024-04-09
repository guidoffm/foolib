# Mvn Test Project

    mvn archetype:generate "-DgroupId=com.mycompany.foo" "-DartifactId=foolib"  "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"

## Build

    mvn clean package assembly:single

## Run

    java --add-opens java.base/java.lang=ALL-UNNAMED -jar .\target\foolib-1.0-SNAPSHOT-jar-with-dependencies.jar