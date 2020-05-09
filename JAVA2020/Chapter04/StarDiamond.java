package Chapter04;

public class StarDiamond {

	public static void main(String[] args) {

		int dan = 5;
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < dan - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print("*");
				} else {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("$");
					}
				}
			}
			System.out.println();
		}

		for (int i = 0; i < dan - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (dan - i - 1) - 1; j++) {
				if (j == 0 || j == 2 * (dan - i - 2)) {
					System.out.print("*");
				} else {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("$");
					}
				}
			}
			System.out.println();
		}
	}
}
