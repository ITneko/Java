package interface_;

public class Triangle implements Shape {
	int width;
	int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height/2;
	}
}
