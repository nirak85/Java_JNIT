package com.sba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String[] args) {
		Resource res= new ClassPathResource("Spring.xml");
		BeanFactory factory= new XmlBeanFactory(res);
		CapitalBank cb= (CapitalBank)factory.getBean("proxyfb");
		cb.withdraw();
		cb.deposit();
	}

}
