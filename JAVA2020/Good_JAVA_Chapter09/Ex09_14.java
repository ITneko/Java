package Good_JAVA_Chapter09;

import java.util.Scanner;

public class Ex09_14 {

	static int calc(int v1, int v2, int op) {
		int result;

		switch (op) {
		case 1:
			result = v1 + v2; break;
		case 2:
			result = v1 - v2; break;
		case 3:
			result = v1 * v2; break;
		case 4:
			result = v1 / v2; break;
		default:
			result = 0;
			System.out.println("입력값 error!");
		}
		
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int res;
		int oper, a, b;

		System.out.print("계산 입력 (1:+, 2:-, 3:*, 4:/) : ");
		oper = sc.nextInt();

		System.out.print("첫번째 숫자를 입력 : ");
		a = sc.nextInt();

		System.out.print("두번째 숫자를 입력 : ");
		b = sc.nextInt();

		res = calc(a, b, oper);

		System.out.printf("계산 결과 : %d\n", res);
	}

}
