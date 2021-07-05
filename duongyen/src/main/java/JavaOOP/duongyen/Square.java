package JavaOOP.duongyen;

import java.util.ArrayList;

public class Square extends Polygon {

	public Square(String color) {
		super(color);
	}
	
	public Square(String color, ArrayList<Vertex> vertexes ) {
		super(color, vertexes);
	}
	@Override
	public String toString() {
		return String.format("i'm a %s square", this.color);
	}
}
