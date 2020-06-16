package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<String,String> answers;
	
	public Question(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void AnswerMap(){
		System.out.println(id+". "+name);
		Set<Entry<String,String>> s= answers.entrySet();
		
		//we need to have list, for that we can use iterator
		Iterator<Entry<String,String>> i=s.iterator();
		//why we use entry coz it has getKey and getValue
		while(i.hasNext()){	 //whether value exit or not or if it's true
			Entry<String,String> x= i.next();
			System.out.println(x.getKey()+". "+x.getValue());
		}
	}

}
