package JavaM_Chapter05_Example;

public class Line extends Shape {
	
	public Line(Shape obj) {
		super.setNext(obj);
	}

	@Override
	public void setNext(Shape obj) {
		super.setNext(obj);
	}

	@Override
	public void draw() {
	}

	@Override
	public Shape getNext() {
		return super.getNext();
	}

}
