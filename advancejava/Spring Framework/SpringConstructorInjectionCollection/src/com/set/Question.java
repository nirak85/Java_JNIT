package com.set;

import java.util.Iterator;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Set<String> answers;
	public Question(int id, String name, Set<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public void AnswerSet(){
		System.out.println(id+". "+name);
		//we need to have list, for that we can use iterator
		Iterator<String> i=answers.iterator();
		while(i.hasNext()){	//whether value exit or not
			System.out.println(i.next());
		}
	}

}
