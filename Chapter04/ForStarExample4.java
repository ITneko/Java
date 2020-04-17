package Chapter04;

public class ForStarExample4 {

	public static void main(String[] args) {

		int dan = 5;
//		int dan2 = 0;
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan-i-1; j++) {
			System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
//		for (int i = 0; i < dan; i++) {
//			for (int j = dan; j > i + 1; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < dan2\ * 2 + 1; k++) {
//				System.out.print("*");
//			}
//			dan2++;
//			for (int j = dan; j > i + 1; j--) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
	}

}