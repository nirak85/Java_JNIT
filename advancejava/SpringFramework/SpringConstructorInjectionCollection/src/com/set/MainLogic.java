package com.set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("spconfig2.xml");
		BeanFactory factory= new XmlBeanFactory(res);
		Object o= factory.getBean("cone");
		Question s= (Question)o;
		s.AnswerSet();
		
	}
}
