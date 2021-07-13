package com.logigear.oop.ex2;

import java.awt.List;

public class Human {
	public String name;
	public int age;
	public float weight;
	public float height;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getWeight() {
		return weight;
	}
	public float getHeight() {
		return height;
	}
	
	public void printProfile(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//public List<Contact> contacts;
	
	
}
