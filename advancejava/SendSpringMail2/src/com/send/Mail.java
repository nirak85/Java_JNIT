package com.send;


import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class Mail { 
	private JavaMailSender mail;

	public void setMail(JavaMailSender mail) {
		this.mail = mail;
	}
	//create method to send mail
	public void sendMail(String receiver, String subject, String text) {
		MimeMessage mimeMessage= mail.createMimeMessage();
		try {
		
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper .setTo(receiver);
		mimeMessageHelper .setSubject(subject);
		mimeMessageHelper .setText(text);
			FileSystemResource file= new FileSystemResource("/Users/keeshab/Desktop/pic.png");
			mimeMessageHelper.addAttachment(file.getFilename(), file);
			mail.send(mimeMessage);
			
			System.out.println("Your Mail sent");
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
