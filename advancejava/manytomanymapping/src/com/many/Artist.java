package com.many;

import java.util.Set;

public class Artist {
	private int aid;
	private String aname;
	private String main;
	private int age;
	private Set album;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set getAlbum() {
		return album;
	}
	public void setAlbum(Set album) {
		this.album = album;
	}
	
}
