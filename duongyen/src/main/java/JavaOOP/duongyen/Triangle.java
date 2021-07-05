package JavaOOP.duongyen;

import java.util.ArrayList;

public class Triangle extends Polygon {

	public Triangle(String color) {
		super(color);
	}
	
	public Triangle(String color, ArrayList<Vertex> vertexes ) {
		super(color, vertexes);
	}

	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("I am a %s triangle", this.color);
	}
	
	

}
