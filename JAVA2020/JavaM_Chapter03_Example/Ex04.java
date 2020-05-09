package JavaM_Chapter03_Example;

/*
Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라. 다음은 e를 입력받았을 경우이다.
소문자 알파벳 하나를 입력하시오>>e
abcde
abcd
abc
ab
a
 */
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
		char c = s.charAt(0);
		
		for(int i = c; i>='a'; i--) {
			for(int j='a'; j<=i; j++) {
				System.out.printf("%c",j);
			}
			System.out.println();
		}
	}
}