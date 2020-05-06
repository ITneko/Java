package Good_JAVA_Chapter10;

import java.util.Scanner;

public class Ex10_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1, str2, str3;
		
		System.out.print("단어 3개 입력 : ");
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		
		System.out.print("입력된 문자열 ==> ");
		System.out.print(str1 + "," + str2 + "," + str3);
	}

}
