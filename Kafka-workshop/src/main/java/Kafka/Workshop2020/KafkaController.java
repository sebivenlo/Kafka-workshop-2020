package Kafka.Workshop2020;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {

        this.producer = producer;
    }
    /// posting producer data/information to kafka broker
    @PostMapping("/publish")
    public void writeMessageToTopic(@RequestParam("message") String message) {
        this.producer.writeMessage(message);

    }

}

