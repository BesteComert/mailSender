package com.besteco.udemySpring.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MockMailSender implements MailSender {
	
	private  static Log log = LogFactory.getLog(MockMailSender.class);
			
	@Override
	public void send(String to, String subject, String body) {
		//TODO Auto-generated method stub
		log.info("Sending MOCK mail to "+ to);
		log.info(" with subject "+ subject);
		log.info(" and body "+ body);
	}
}
