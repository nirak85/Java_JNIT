package com.many;

import java.util.Set;

public class Album {
	private int alid;
	private String alname;
	private String genres;
	private int date;
	private Set artist;
	public int getAlid() {
		return alid;
	}
	public void setAlid(int alid) {
		this.alid = alid;
	}
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Set getArtist() {
		return artist;
	}
	public void setArtist(Set artist) {
		this.artist = artist;
	}
	

	
}
