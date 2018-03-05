package com.think.queueservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.think.queueservice.api.Message;
import com.think.queueservice.service.MessageQueueService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageQueueService messageQueueService;
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public ResponseEntity<String> saveMessage(@RequestBody Message message) {
		messageQueueService.saveMessage(message.getMessage());
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
