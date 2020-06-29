package com.spboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Hello {

	public static void main(String[] args) {
		ConfigurableApplicationContext catx= SpringApplication.run(Hello.class, args);
		WelcomeBean wb= catx.getBean(WelcomeBean.class);
		wb.setText("Welcome to spring boot");
		
		System.out.println(wb.getText());
		
		Apartment apt= catx.getBean(Apartment.class);
		apt.setNumber(820);
		apt.setName("THE RANCH");
		apt.setRent(825.75);
		System.out.println("I got the room in '"+apt.getName()+ "' apartment. The room number is "+apt.getNumber()+". Its 2 bedroom apartment. The current rent for that room is $"+apt.getRent());
	}

}
 