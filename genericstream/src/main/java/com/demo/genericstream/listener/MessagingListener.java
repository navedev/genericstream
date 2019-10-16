/**
* Test Copyright Code
*/
package com.demo.genericstream.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.demo.genericstream.model.Note;
import com.demo.genericstream.stream.MessageStream;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessagingListener {

	@StreamListener(value = MessageStream.INPUT_CHANNEL)
	public void handleMessage(@Payload Note note) {

		log.info("Inside handleMessage() -- {}", note);

	}

}
