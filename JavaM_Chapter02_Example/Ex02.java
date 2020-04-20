package JavaM_Chapter02_Example;

//2. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라. 

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int jungsu;
		while (true) {
			jungsu = scanner.nextInt();
			if (jungsu < 10 || jungsu > 99) {
				System.out.println("입력된 값은 2자리 정수가 아닙니다!");
				System.out.print("2자리수 정수 입력(10~99)>> ");
			} else
				break;
		}
		int a, b;
		a = jungsu / 10;
		b = jungsu % 10;
		if (a == b) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
			System.out.printf("10의 자리 : %d\n 1의 자리 : %d", a, b);
		} else {
			System.out.println("NO! 10의 자리와 1의자리가 같지 않습니다.");
			System.out.printf("10의 자리 : %d\n 1의 자리 : %d", a, b);
		}
	}
}
