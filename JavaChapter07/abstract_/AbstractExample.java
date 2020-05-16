package abstract_;

public class AbstractExample {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		
		System.out.println("원의 넓이는 : " + circle.getArea());
		System.out.println("도형의 위치는 : " + circle.position());
	}

}
