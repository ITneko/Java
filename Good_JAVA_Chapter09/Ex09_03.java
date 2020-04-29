package Good_JAVA_Chapter09;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		boolean yn;

		System.out.print("문자열 입력 ==> ");
		str = sc.nextLine();
		yn = str.startsWith("A");

		System.out.print("출력 문자열 ==> ");

		if (!str.startsWith("("))
			System.out.print("(");

		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));

		if (!str.endsWith(")"))
			System.out.print(")");
		
		System.out.println("\nA로 시작했는가? "+yn);
	
	}

}
