package JavaOOP.duongyen;

public class Circle extends Shape{

	private double radius;
	private double pi = 3.14;


	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}


	@Override
	public double getPerimeter() {
		System.out.println("My perimeter is " + 2 * radius * pi);
		return 2 * radius * pi;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("I am a %s Circle", this.color);
	}

}
