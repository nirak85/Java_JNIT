package com.setter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Course {

	private Set studentCourse;

	public Set getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(Set studentCourse) {
		this.studentCourse = studentCourse;
	}

	
	
	/* private List studentCourse;

	public List getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(List studentCourse) {
		this.studentCourse = studentCourse;
	}
	*/
	
	/*private Map studentCourse;

	public void setStudentCourse(Map studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	public void details(){
		Set s= studentCourse.entrySet();
		Iterator i= s.iterator();
		while(i.hasNext()){
			Map.Entry me= (Map.Entry)i.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}
	*/
	
}
