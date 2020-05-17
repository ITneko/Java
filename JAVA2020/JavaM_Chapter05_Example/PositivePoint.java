package JavaM_Chapter05_Example;

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(0,0);
		
		if (x < 0 || 0 > y) 
			return;
		
		super.move(x, y);
	}

	public void move(int x, int y) {
		if (x < 0 || 0 > y)
			return;
		super.move(x, y);
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")의 점";
	}
}
