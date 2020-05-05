package JavaM_Chapter03_Example;

//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하고 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라

public class Ex09 {

	public static void main(String[] args) {

		int randValue;
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				randValue = (int)(Math.random()*10)+1;
				arr[i][j] = randValue;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
	}

}
