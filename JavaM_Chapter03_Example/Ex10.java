package JavaM_Chapter03_Example;

//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤생성하여 임의의 위치에 삽입하라.
//동일한 정수가 있어도 상관없다. 나머지 6개는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.

public class Ex10 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		int randValue, randi, randj;
		
		for(int i=0; i<10; i++) {
			randValue = (int)(Math.random()*10)+1;
			randi = (int)(Math.random()*4);
			randj = (int)(Math.random()*4);
			if(arr[randi][randj] == 0)
				arr[randi][randj] = randValue;
			else
				--i;
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
