package JavaM_Chapter02_Example;

/*
 * 1. Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
 * $1=1100원으로 가정하고 계산하라
 */
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int won;
		System.out.print("원화를 입력하세요(단위 원)>> ");
		won = scanner.nextInt();
		System.out.printf("%d원은 %.1f$입니다.", won, (float)won/1100);
		
	}

}