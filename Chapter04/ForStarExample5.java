package Chapter04;

public class ForStarExample5 {

	public static void main(String[] args) {

		int dan = 5;
		int dan2 = 9;

		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = dan2; k > i; k--) {
				System.out.print("*");
			}
			dan2--;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
