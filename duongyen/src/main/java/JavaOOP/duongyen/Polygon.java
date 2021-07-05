package JavaOOP.duongyen;

import java.util.ArrayList;

public abstract class Polygon extends Shape {

	private ArrayList<Vertex> vertexes;

	public Polygon(String color) {
		super(color);
	}

	public Polygon(String color, ArrayList<Vertex> vertexes) {
		super(color);
		this.vertexes = vertexes;

	}


	public String toString() {
		return "Im a Polygon";
	}

	@Override
	public double getPerimeter() {
		double perimeter = 0;
		int len = vertexes.size();

		for (int i = 0; i < len - 1; i++) {
			perimeter += vertexes.get(i).getLength(vertexes.get(i + 1));		
		}
		perimeter += vertexes.get(0).getLength(vertexes.get(len - 1));
		
		return perimeter;
	}

}
