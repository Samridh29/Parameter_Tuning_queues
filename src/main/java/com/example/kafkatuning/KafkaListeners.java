package com.example.kafkatuning;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "Samridh", groupId = "group_id")
    void Listerner1(String message){
        System.out.println("Listener 1: "+message);
    }
}
