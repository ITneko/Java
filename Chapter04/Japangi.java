package Chapter04;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {

		System.out.println("구매할 음료수의 초성을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		switch (str.charAt(0)) {
		case 'h':
		case 'H':
		case 'ㅎ':
			System.out.println("헛깨수를 구매하셨습니다.");
			break;

		case '2':
			System.out.println("2%를 구매하셨습니다.");
			break;

		case 's':
		case 'S':
		case 'ㅅ':
			System.out.println("사이다를 구매하셨습니다.");
			break;

		case 'b':
		case 'B':
		case 'ㅂ':
			System.out.println("보리차를 구매하셨습니다.");
			break;

		case 'e':
			System.out.println("구매를 취소합니다.");
			System.exit(0);

		default:
			System.out.println("품절된 상품입니다.");
			break;
		}
	}

}
