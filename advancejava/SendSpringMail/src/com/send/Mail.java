package com.send;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class Mail { 
	private MailSender mail;

	public void setMail(MailSender mail) {
		this.mail = mail;
	}
	//create method to send mail
	public void sendMail(String receiver, String subject, String text) {
		SimpleMailMessage mesg= new SimpleMailMessage();
			mesg.setTo(receiver);
			mesg.setSubject(subject);
			mesg.setText(text);
			mail.send(mesg);
			
			System.out.println("Your Mail sent");
	}

}
