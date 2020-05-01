package JAVAExampleETC;

public class Ex01 {

	public static void main(String[] args) {

		int[][] arr = new int[4][];
//		arr[0] = new int[1];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		arr[3] = new int[4];
				
		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i+1; j++) {
				arr[i] = new int[i+1];
				arr[i][j] = a++;
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
