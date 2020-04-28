package ExampleJava20_04_28;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		int hap;

		System.out.print("1번째 숫자를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : ");
		c = sc.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : ");
		d = sc.nextInt();

		hap = a + b + c + d;
		System.out.printf("합계 ==> %d\n", hap);
	}

}
