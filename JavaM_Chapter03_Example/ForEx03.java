package JavaM_Chapter03_Example;

public class ForEx03 {

	public static void main(String[] args) {

		int i, j, k; // k=단수, j=단의 변화수, i=3단씩 증가

		for (i = 1; i < 9; i += 3) {
			for (j = 1; j <= 9; ++j) {
				if (j == 1) {
					for (k = i; k <= i + 2; k++)
						System.out.printf("%d단\t\t", k);
					System.out.println();
				}
				for (k = i; k <= i + 2; k++)
					System.out.printf("%d * %d = %2d \t", k, j, k * j);
				System.out.println();
			}
			System.out.println();
		}

	}
}
