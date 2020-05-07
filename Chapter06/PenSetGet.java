package Chapter06;

public class PenSetGet {

	public static void main(String[] args) {
		Pen p1 = new Pen("Black", 20, 20);
		
		System.out.printf("%s, %d, %d", p1.color, p1.length, p1.price);
		System.out.println();
		
		p1.setColor("Red");
		p1.setLength(30);
		p1.setPrice(30);
		
		System.out.printf("%s, %d, %d", p1.color, p1.length, p1.price);
	}

}
