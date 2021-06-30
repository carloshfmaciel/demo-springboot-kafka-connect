package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.builder.MessageBuilder;
import com.example.message.Message;
import com.example.producer.Producer;

@RestController
public class DispatchKafkaMessageController {

	@Autowired
	private Producer producer;

	@PostMapping(path = "/dispatch-topic-message")
	public void dispatchMessage() {
		Message message = MessageBuilder.build();
		producer.sendMessage(message);
	}

}
