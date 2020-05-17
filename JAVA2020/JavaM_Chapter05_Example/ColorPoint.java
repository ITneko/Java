package JavaM_Chapter05_Example;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 (" + this.getX() + "," + this.getY() + ") 의 점";
	}

}
