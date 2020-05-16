package Ex01;

public class Circle extends Shape{
	private static final double PI = 3.141592;
	private int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return PI*getRadius()*getRadius();
	}
}
