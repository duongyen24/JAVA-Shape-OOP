package com.logigear.oop.ex2;

public class Man extends All {
	
	private int salary;
	
	public Man(String name, int age, float weight, float height, int salary) {
		super(name, age, weight, height);
		this.salary = salary;
	
	}
	
	@Override
	public void print() {
	    System.out.println("Hey my name is " + this.name + " I am " + this.age);
	  }
	
	

	

}
