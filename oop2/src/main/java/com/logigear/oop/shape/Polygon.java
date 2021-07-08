package com.logigear.oop.shape;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public abstract class Polygon extends Shape {
	protected List<Vertex> vertexes;
	
	public Polygon(String color) {
		super(color);
		this.vertexes = new ArrayList<Vertex>();
	}

	public Polygon(String color, List<Vertex> vertexes) {
		super(color);
		this.vertexes = vertexes;
	}
	
	public void addVertex(Vertex vertex) {
		this.vertexes.add(vertex);
	}

	public double getPerimeter() {
		double result = 0;

		for (int i = 0; i < vertexes.size() - 1; i++) {
			result += vertexes.get(i).getDistanceTo(vertexes.get(i + 1));
		}

		result += vertexes.get(vertexes.size()-1).getDistanceTo(vertexes.get(0));

		return result;
	}

	public String toString() {
		return "Hello! I am a Polygon.";
	}
	
	protected String getVertexInfo() {
		Gson gson = new Gson();
		return gson.toJson(vertexes);
	}
}
