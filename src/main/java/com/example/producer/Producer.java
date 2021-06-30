package com.example.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.message.Message;

@Component
public class Producer {

	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;

	private String topic = "xpto";

	public void sendMessage(Message message) {
		final String key = UUID.randomUUID().toString();
		kafkaTemplate.send(topic, key, message);
	}

}
