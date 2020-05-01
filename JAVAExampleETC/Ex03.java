package JAVAExampleETC;

public class Ex03 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int a = 1;
		
		for(int i=4; i>=0; i--) {
			for(int j=3; j>=0; j--) {
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
/*
 순서
arr[4][5] arr[3][5] arr[2][5] arr[1][5]	j--, i(5)	
arr[4][4] arr[3][4] arr[2][4] arr[1][4]	j--, i(4)
arr[4][3] arr[3][3] arr[2][3] arr[1][3]	j--, i(3)	

규칙
	i는 5(4)에서 시작하며 --i (첫for문)
	j는 4(3)에서 시작하며 --j (2번째 for문)
	arr[ j ][ i ]
*/