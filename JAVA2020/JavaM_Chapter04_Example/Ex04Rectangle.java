package JavaM_Chapter04_Example;

public class Ex04Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Ex04Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + ","+ y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}

	boolean contains(Ex04Rectangle r) {
		if(x < r.x && y < r.y)
	         if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
	            return true;
	      return false;
	}
	
}
 