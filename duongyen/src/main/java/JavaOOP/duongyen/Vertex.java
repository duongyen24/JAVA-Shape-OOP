package JavaOOP.duongyen;

public class Vertex {

	private int x;
	private int y;

	public Vertex(int x1, int y1) {
		this.x = x1;
		this.y = y1;
	}


	public double getLength(Vertex ver) {
		return Math.sqrt((Math.pow((x - ver.x), 2) + Math.pow((y - ver.y), 2)));
	}
	
	public String toString() {
		return String.format("X: %d, Y:%d", this.x, this.y);
		
	}

}