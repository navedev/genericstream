/**
* Test Copyright Code
*/
package com.demo.genericstream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.genericstream.model.Note;
import com.demo.genericstream.service.MessagingService;

@RestController
public class MessagingController {

	@Autowired
	private MessagingService messagingService;

	@GetMapping("/sendmessage")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public void sendMessage(@RequestParam("message") String message) {

		Note note = Note.builder().message(message).timestamp(System.currentTimeMillis()).build();

		messagingService.sendMessage(note);

	}

}
