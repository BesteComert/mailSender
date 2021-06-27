package com.besteco.udemySpring.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.besteco.udemySpring.mail.MailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;
	
	
	public MailController(MailSender stmp) {
		this.mailSender = stmp;
	}
	
	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		mailSender.send("who@example.com","with subject A test mail","and body Body of the test mail");
		return "Mail sent";
		
	}

}
