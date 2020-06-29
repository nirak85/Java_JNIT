package com.send;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[] args) {
	Resource res= new ClassPathResource("spring.xml");
	BeanFactory factory= new XmlBeanFactory(res);
	Mail sender= (Mail)factory.getBean("sms");
	sender.sendMail("shakyaniraj00@gmail.com", "first server message", "We are using the spring to send the mail");
}
}
