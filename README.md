# README #

### What is this repository for? ###
Basic Spring Boot app to demo how to use Zuul to redirect HTTP calls


### How do I get set up? ###

* Build with maven
mvn package

* Run the jar in **dev** mode
java  -Dspring.profiles.active=dev  -jar target/cirrus-up-cloud-demo-redirect-request-1.0-SNAPSHOT.jar


### Curl Requests ###

curl -X GET 'http://localhost:8080/demo2?name=tom'
Hello, tom!

curl -X GET 'http://localhost:8080/demo/jerry'
Hello, jerry!
