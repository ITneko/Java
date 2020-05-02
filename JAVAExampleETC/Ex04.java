package JAVAExampleETC;

public class Ex04 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int a = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				arr[j][i] = a++;
			}
		}
		

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
