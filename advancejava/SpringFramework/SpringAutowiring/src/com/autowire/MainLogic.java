package com.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("spconfig.xml");
		BeanFactory factory= new XmlBeanFactory(res);
		Genre g= (Genre)factory.getBean("cinema");
		g.movieInfo();
		
	}
}
