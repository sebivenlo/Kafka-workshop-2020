# Kafka-workshop
Kafka Workshop as part of the module-Enterprise Software Development 2020-2021 by Kelvin Akuffo and Ibrahim Okumu
## Table of contents
  * [Prerequisites](#prerequisites)
  * [Starting up the demo project](#Starting the demo project)

    
  ## Prerequisites
To participation in the workshop, [Docker](https://www.docker.com/get-started) and an IDE ([IntelliJ](https://www.jetbrains.com/idea/download/) or [Netbeans](https://netbeans.apache.org/download/index.html)) must be installed.

If using Netbeans, then  [Postman](https://www.postman.com/downloads/) must also be installed.

## Starting the demo project (Simple messaging service-Spring Apache Kafka)
We use a maven project created using  [Spring](http://start.spring.io/). in the demo. Two dependencies are added:
* Spring for Apache Kafka 
* Spring Web


1. First, clone the repository.
2. Then run `docker-compose up` in the root of the repository. Docker will download a kafka and zookeeper image.
3. Open the project on your preferred IDE (Intellij/Netbeans).
4. Within the project, run the `KafkaWorkshopApplication` (java class), this should start the demo project.

### If using Intellij 
To send a message from the `KafkaProducer` (java class) go to:

#### Step 1:
1.Click tools on the navigation bar of Intellij

#### Step 2:
2.Navigate to Http Client and select `Test Restful Web Service`

#### Step 3:
3.Use the Post method to send a message from the `KafkaProducer` to `KafkaConsumer` e.g (`POST http://localhost:8080/publish?message=hello`)

#### Step 4:
4.Click run, the message "hello" will be printed out by the consumer in the running `KafkaWorkshopApplication` console

### If using Netbeans
To send a message from the `KafkaProducer` (java class) open:

#### Step 1:
1.The Postman canary that you previously installed

#### Step 2:
2.Use the post method and type in `http://localhost:8080/publish`

#### Step 3:
3.For the key field Type in `message` and for the value field type in the message you would like to send to the `Kafkaconsumer`.

#### Step 4:
4.Click send, the message you typed in the Value field will be printed out by the consumer in the running `KafkaWorkshopApplication` console

## Documentation for the libraries:

### Apache Kafka documentation
https://kafka.apache.org/documentation/
And also the javadocs provided like for instance: 
https://kafka.apache.org/23/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html

### Spring Kafka documentation
https://docs.spring.io/spring-kafka/reference/html/ Chapter 3 and onwards.
