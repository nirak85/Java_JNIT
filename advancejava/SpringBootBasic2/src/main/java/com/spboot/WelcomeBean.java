package com.spboot;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
	private String text;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void show(){
		System.out.println(text);
	}

}
