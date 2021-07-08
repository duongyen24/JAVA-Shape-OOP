package com.logigear.oop.shape;

public abstract class Shape {
	
	protected String color;

	public String getColor() {
		return color;
	}

	public abstract double getPerimeter();
	public abstract String toString();
	
	public Shape(String color) {
		this.color = color;
	}
	
}
