package JavaM_Chapter02_Example;

//4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		
		System.out.print("정수 3개를 입력>>");
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		
		if (i <= j || k <= j)
			System.out.println("중간값은 " + j + "입니다.");
		else if (i <= k || k <= i)
			System.out.println("중간값은 " + i + "입니다.");
		else
			System.out.println("중간값은 " + k + "입니다.");
	}
}