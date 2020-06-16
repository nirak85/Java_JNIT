package com.list;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;
	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public void AnswerList(){
		System.out.println(id+". "+name);
		//we need to have list, for that we can use iterator
		Iterator<String> i=answers.iterator();
		while(i.hasNext()){	//whether value exit or not
			System.out.println(i.next());
		}
	}

}
