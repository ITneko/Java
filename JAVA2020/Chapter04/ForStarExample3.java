package Chapter04;

public class ForStarExample3 {

	public static void main(String[] args) {

		int dan = 5;

		for (int i = 0; i < dan; i++) {
			for (int j = dan - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
