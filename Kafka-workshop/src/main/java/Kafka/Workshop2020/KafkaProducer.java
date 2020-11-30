package Kafka.Workshop2020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC= "mytopic";

    // The Kafka Template provides convenience methods to send data to Kafka Topics and wraps a Producer.
@Autowired
    private KafkaTemplate <String,String> KafkaTemplate;


    public void writeMessage(String msg){

        this.KafkaTemplate.send(TOPIC, msg);
    }

}
