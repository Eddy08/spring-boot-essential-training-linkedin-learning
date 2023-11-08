package com.harsh.sbet.clr.roomcleanernotifier;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    public RabbitTemplate rabbitTemplate;
    @Autowired
    public ObjectMapper objectMapper;

    @Autowired
    public ConfigurableApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        int index=(int) (Math.random()*(28-1))+1;
        AsyncPayload payload =new AsyncPayload();
        payload.setId(index);
        payload.setModel("ROOM");
        rabbitTemplate.convertAndSend("operations","landon.rooms.cleaner", objectMapper.writeValueAsString(payload));
        context.close();
    }
}
