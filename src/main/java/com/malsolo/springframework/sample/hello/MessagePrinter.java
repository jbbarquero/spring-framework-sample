package com.malsolo.springframework.sample.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	
	static final Logger logger = LoggerFactory.getLogger(MessagePrinter.class);

	@Autowired
    private MessageService service;

	public void printMessage() {
		logger.info(this.service.getMessage());
    }

}
