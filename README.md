# Spring-Cloud-Stream
Spring cloud binder example, This example is a simple demo how to use Spring cloud binder to plug in kafka

1. Since in this project we are going to integrate with Kafka, we are using following binder dependency. If you are using RabitMQ or any other message brokers, use the appropriate binder dependecy here

    <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-stream-binder-kafka</artifactId>
		</dependency>
    
2. Install Kafkacat to use that as command line producer and consumer. Use below command to install it if you are using brew.
brew install kafkacat

3. Download Kafka and extract it in a folder and start zookeeper and Kafka server, using below commands

4. Clone this repo and import it in your IDE and start it as usual Spring Boot application.
5. Observe the console log, where you could see the topic name for which the application is subscribed. By default the topic names will be as follows.

Input(Consumer) : toUpperCase-in-0 (name of the method, in camel case and in and out as per consumer and producer)
Output(Producer) : toUpperCase-out-0 (name of the method, in camel case)

6. Once the server is up run the below command in terminal, here we are using Kafkacat to pretend out terminal as message producer and consumers
7. Kakacat producer will produce a message and pass it to the consumer topic (toUpperCase-in-0), run below command
kafkacat -b localhost:9092 -t toUpperCase-in-0 -P

8. Kafkacat consumer will consume that message using producer topic(toUpperCase-out-0), run below command
kafkacat -b localhost:9092 -t toUpperCase-out-0

9. Now enter some strings into producer, at the terminal of step 7 and observe consumer at termila of step 8. Strings will be converted to upper case in real time

