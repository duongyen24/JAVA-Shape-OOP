package com.logigear.oop.shape;

public class Circle extends Shape{
		
	protected Vertex centralPoint;
	protected double radius;
	protected final double pi = 3.14;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * this.pi * this.radius;
	}

	@Override
	public String toString() {
		return String.format("Hi there! I am a lovely %s Circle.", this.color);
	}

}
