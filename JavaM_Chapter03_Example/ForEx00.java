package JavaM_Chapter03_Example;

//for문을 이용한 숫자피라미드 0을 중앙으로

public class ForEx00 {

	public static void main(String[] args) {

		int dan = 15;
		int count = dan-9;
		for (int i = 0; i < dan + 1; i++) {
			for (int a = dan - i + count; a > 0; a--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
			if (i >= 9)
				count--;
		}
	}
}