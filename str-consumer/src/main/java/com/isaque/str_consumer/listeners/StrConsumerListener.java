package com.isaque.str_consumer.listeners;

import com.isaque.str_consumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("CREATE ::: Received Message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void LOG(String message){
        log.info("LOG ::: Received Message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2")
    public void history(String message){
        log.info("HISTORY ::: Received Message {}", message);
    }
}
