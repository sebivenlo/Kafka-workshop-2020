package Kafka.Workshop2020;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    // group id specifies the name of the consumer group a kafka consumer belongs to.
    @KafkaListener(topics="mytopic", groupId="my_group_id")
    public void getMessage(String message){

        System.out.println(message);

    }
}