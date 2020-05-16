package interface_;

public class InterfaceExample {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(20,34);
		Triangle tri = new Triangle(20,34);
		
		System.out.println("rect's Area = " + rect.getArea());
		System.out.println("tri's Area = " + tri.getArea());
	}

}
