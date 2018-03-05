package com.think.queueservice.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageQueueService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;
	
	public void saveMessage(String message) {
		rabbitTemplate.convertAndSend(queue.getName(), message);
	}

}
