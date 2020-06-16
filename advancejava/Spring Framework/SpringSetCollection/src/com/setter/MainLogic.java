package com.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Set;

public class MainLogic {
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("spconfig.xml");
		
		BeanFactory factory= new XmlBeanFactory(res);
		Object o= factory.getBean("course");
		Course c= (Course)o;
		
		Set s= c.getStudentCourse();
for(Object ob: s){
			System.out.println(ob);
		}
		
//	System.out.println(c.getStudentCourse());
		
//		c.details();
		
		
	}
}
