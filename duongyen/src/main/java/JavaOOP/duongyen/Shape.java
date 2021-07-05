package JavaOOP.duongyen;

public abstract class Shape {

	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract double getPerimeter();
	public abstract String toString();

}