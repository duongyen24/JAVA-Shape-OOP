package com.logigear.oop.shape;

import java.util.List;

public class Triangle extends Polygon {
	
	public Triangle(String color) {
		super(color);
	}
	public Triangle(String color, List<Vertex> vertexes) {
		super(color, vertexes);
	}

	public String toString() {
		return String.format("Hello! I am a %s Triangle. Here is my vertexes info: %s", this.getColor(), this.getVertexInfo());
	}
}
