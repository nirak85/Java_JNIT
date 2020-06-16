package com.constructor;

public class Student {
	private int id;
	private String name;
	private char grade;
	
	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}


	public void show(){
		System.out.println("Id: "+id+"  "+"Name: "+name+"  "+"Grade: "+grade+"+");
	}

}
