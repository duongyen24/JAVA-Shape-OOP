package com.logigear.oop.shape;

import java.util.List;

public class Square extends Polygon {
	
	public Square(String color) {
		super(color);
	}
	
	public Square(String color, List<Vertex> vertexes) {
		super(color, vertexes);
	}

	public String toString() {
		return String.format("Hello! I am a mighty %s Rectangle. I have 4 equal edges. Here is my vertexes info: %s", this.getColor(), this.getVertexInfo());
	}
}
