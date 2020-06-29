package com.autowire;

public class Genre {
	private String name;
	private Movie m;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie getM() {
		return m;
	}
	public void setM(Movie m) {
		this.m = m;
	}
	public void movieInfo(){
		System.out.println("          ***Movie Theater***");
		System.out.println("---------------------------------------------------");
		System.out.println("Red Hot Chilli presenting- "+ name);
		System.out.println("Movie: "+m.getMoviename());
		System.out.println("Ticket: $"+m.getTicket()+" only");
		
	}

}
