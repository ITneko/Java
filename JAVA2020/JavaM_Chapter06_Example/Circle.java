package JavaM_Chapter06_Example;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}
	
	public boolean equals(Circle a) {
		if(a.x == this.x && a.y == this.y)
			return true;
		return false;
	}
}
