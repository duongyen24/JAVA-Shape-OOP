package com.logigear.oop.shape;

public class Vertex {

	private int x;
	private int y;
	
	public Vertex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistanceTo(Vertex anotherVertex) {
		return Math.sqrt(Math.pow(this.x - anotherVertex.x, 2) + Math.pow(this.y - anotherVertex.y, 2));
	}
	
	public String toString() {
		return String.format("X: %d, Y: %d", this.x, this.y);
	}
}
