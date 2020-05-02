package JAVAExampleETC;

public class Ex05 {

	public static void main(String[] args) {

		int[][] arr = new int[4][];
		int a = 1;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-i; j++) {
				arr[i] = new int[j+1];
				arr[i][j] = a++;
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	
	
	}

}
