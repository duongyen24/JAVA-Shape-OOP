package com.logigear.oop.ex2;

import java.util.ArrayList;

public class All extends Contact {
	public String name;
	public int age;
	public float weight;
	public float height;

	private ArrayList<Contact> contact;

	
	public All(String name, int age, float weight, float height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
			}

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

	public void print() {
		System.out.println("Hey my name is " + this.name + " I am " + this.age +this.contact);
	}

	public void addValues(String address, int phone) {

		ArrayList<Contact> list = new ArrayList<Contact>();
		list.add(new Contact(address, phone));
	
		printValues(list);
	}

	public ArrayList<Contact> printValues(ArrayList<Contact> list) {
		
		return list;
		}
	}



