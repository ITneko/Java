package JavaM_Chapter05_Example;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void moveUp() {
		this.z += 1;
	}
	
	public void moveDown() {
		this.z -= 1;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "," + this.getZ() + ")의 점";
	}
}
