package Kafaka.Workshop0.Kafka.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC= "mytopic";

@Autowired
    private KafkaTemplate <String,String> KafkaTemplate;

    public void writeMessage(String msg){

        this.KafkaTemplate.send(TOPIC, msg);
    }

}
