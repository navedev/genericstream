/**
* Test Copyright Code
*/
package com.demo.genericstream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.demo.genericstream.model.Note;
import com.demo.genericstream.stream.MessageStream;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MessagingService {

	@Autowired
	private MessageStream messageStream;

	public void sendMessage(Note note) {

		log.info("Inside sendMessage()");

		MessageChannel msgChannel = messageStream.outboundMessage();

		msgChannel.send(MessageBuilder.withPayload(note)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

	}

}
