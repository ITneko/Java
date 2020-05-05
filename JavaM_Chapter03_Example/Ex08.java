package JavaM_Chapter03_Example;

//정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 
//배열에는 같은 수가 없도록하고 배열을 출력하라
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rnadValue, count=0;
		int a = 0;
		int[] arr;
		
		while (true) {
			System.out.print("정수 몇개?");
			a = sc.nextInt();

			if (a > 0 && a < 100) {
				arr = new int[a];
				break;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			rnadValue = (int) (Math.random() * 100)+1;
			arr[i] = rnadValue;
			
			for(int j=0; j<i; j++) 
				if (arr[i]==arr[j]) 
					i--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%3d ",arr[i]);
			count++;
			if(count%10==0)
				System.out.println();
		}

	}

}
