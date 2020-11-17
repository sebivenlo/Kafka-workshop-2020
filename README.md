# Kafka-workshop
Kafka Workshop as part of the module-Enterprise Software Development 2020-2021 by Kelvin Akuffo and Ibrahim Okumu
## Table of contents
  * [Prerequisites](#prerequisites)
  * [Starting up the demo project](#Demo)
    
  ## Prerequisites
For the successful participation in the workshop, [Docker](https://www.docker.com/get-started) as well as a IDE (e.g. [IntelliJ](https://www.jetbrains.com/idea/download/) or [Netbeans](https://netbeans.apache.org/download/index.html))have to be previously installed by the participants.
If using Netbeans then a http request client should be installed such as [Postman](https://www.postman.com/downloads/) to be used sending requests from the Demo project.
## Starting up the demo project (Spring Apache Kafka)
The demo project is a Maven project which has been set up using the Spring boot Apache Kafka Template which uses The spring for Apache kafka dependency and spring web dependancy. If you want to experiment with setting up a spring boot Apache kafka project this can be done on [Spring](http://start.spring.io/).

1. First clone the repository.

2. Then run `docker-compose up` in the root of the repository, docker will now download and start kafka and zookeeper for you.
3. Open the Project on your choosen IDE
4. Within the project run the `KafkaWorkshopApplication` (java class)
5. The demo project will start and run the Spring Apache Kafka
### If using Intellij 
To test out sending a message from the `KafkaProducer` (java class) go to:
#### Step 1:
1.Tools on the navigation bar of Intellij
#### Step 2:
2.Navigate to Http Client and choose `Test Restful Web Service`
#### Step 3:
3.Use the Post method to send a message from the `KafkaProducer` to `KafkaConsumer` e.g (`POST http://localhost:8080/publish?message=hello`)
#### Step 4:
4.Click run, the message hello will be printed out by the consumer in the running `KafkaWorkshopApplication`
### If using Netbeans
To test out sending a message from the `KafkaProducer` (java class) open:
#### Step 1:
1.The Postman Application that you previously installed
#### Step 2:
2.Use the post method and type in `http://localhost:8080/publish`
#### Step 3:
3.For the key field Type in `message` and for the value field type in the message you would like to send to the `Kafkaconsumer`.
#### Step 4:
4.Click send, the message you typed in the Value field will be printed out by the consumer in the running `KafkaWorkshopApplication`

## Documentation for the libraries

### Apache Kafka documentation
https://kafka.apache.org/documentation/
And also the javadocs provided like for instance: 
https://kafka.apache.org/23/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html

### Spring Kafka documentation
https://docs.spring.io/spring-kafka/reference/html/ Chapter 3 and onwards.
