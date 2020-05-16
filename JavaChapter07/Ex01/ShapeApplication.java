package Ex01;

public class ShapeApplication {

	public static void main(String[] args) {
		Circle myCircle = new Circle("동그라미", 9);
		System.out.println(myCircle.calcArea());
		
		Shape myShape = new Rectangle("네모", 3,2); //polymorphic object
		//Virtual Method Invocation
		System.out.println("사각형 넓이는 " + myShape.calcArea());
		myShape = myCircle;
		System.out.println("원의 넓이는 " + myShape.calcArea());
		//Heterogeneous collection
		Shape[] shapes = new Shape[2];
		shapes[0] = myCircle;
		shapes[1] = new Rectangle("직사각형",5,4);
		Object[] objs = new Object[3];
		objs[0] = "Hello";
		objs[1] = myCircle;
		objs[2] = 100;
		Shape shapeObject = (Shape)objs[1];
		System.out.println(shapeObject.calcArea());
	}

}
