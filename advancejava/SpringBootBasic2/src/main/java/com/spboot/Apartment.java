package com.spboot;

import org.springframework.stereotype.Component;

@Component

public class Apartment {
private int number;
private String name;
private double rent;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
} 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent = rent;
}

}
