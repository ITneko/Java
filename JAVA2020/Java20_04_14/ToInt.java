package Java20_04_14;

public class ToInt {

	public static void main(String[] args) {

		double a = -3.6;
		double b = -3.4;
		double c = 3.4;
		double d = 3.6;
		System.out.printf("%5.1f %5.1f %5.1f %5.1f", a,b,c,d);
		System.out.println();
		System.out.printf("%d %d %d %d", Math.round(a), Math.round(b),Math.round(c),Math.round(d));
		System.out.println();
		System.out.printf("%5.1f %5.1f %5.1f %5.1f", Math.ceil(a), Math.ceil(b), Math.ceil(c), Math.ceil(d));
		System.out.println();
		System.out.printf("%5.1f %5.1f %5.1f %5.1f", Math.floor(a), Math.floor(b), Math.floor(c), Math.floor(d) );
		System.out.println( );
		System.out.printf("%d %d %d %d", (int)(a), (int)(b), (int)(c), (int)(d));
	}

	
}
