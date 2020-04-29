package Good_JAVA_Chapter09;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 ==> ");
		str = sc.nextLine();
		
		System.out.print("출력 문자열 ==> ");
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)=='o')
				System.out.printf("%c",'$');
			else
				System.out.printf("%c",str.charAt(i));
		}
	}

}
