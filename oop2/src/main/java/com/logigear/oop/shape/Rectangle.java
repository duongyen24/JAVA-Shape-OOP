package com.logigear.oop.shape;

import java.util.List;

public class Rectangle extends Polygon {
	
	public Rectangle(String color) {
		super(color);
	}
	public Rectangle(String color, List<Vertex> vertexes) {
		super(color, vertexes);
	}

	public String toString() {
		return String.format("Hello! I am a beautiful %s Rectangle. I have two couple equal edges. Here is my vertexes info: %s", this.getColor(), this.getVertexInfo());
	}
}
