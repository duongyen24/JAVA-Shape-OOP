package JavaOOP.duongyen;

import java.util.ArrayList;

public class Retangle extends Polygon {

	public Retangle(String color) {
		super(color);
	}
	
	public Retangle(String color, ArrayList<Vertex> vertexes ) {
		super(color, vertexes);
	}

	@Override
	public String toString() {
		return String.format("i'm a %s retrangle", this.color);
	}
	
	
	
}