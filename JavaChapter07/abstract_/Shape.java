package abstract_;

public abstract class Shape {
	private int x;
	private int y;
	
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea();
	
	public String position() {
		return "[x=" + x + ", y=" + y + "]";
	}
}
