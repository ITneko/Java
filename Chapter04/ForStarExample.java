package Chapter04;

public class ForStarExample {

	public static void main(String[] args) {

		int dan = 5;
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
