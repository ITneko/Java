package JAVAExampleETC;

public class Ex02 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int a = 1, sw = 1;

		for (int i = 0; i < arr.length; i++) {
			if (sw == 1) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = a++;
				}
			}
			sw = -sw;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}