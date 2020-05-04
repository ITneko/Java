package JavaM_Chapter03_Example;

/*
Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 다음은 5를 입력받았을 경우이다
*****
****
***
**
*
*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int num = sc.nextInt();
		for(int i = num; i>0; i--){
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
