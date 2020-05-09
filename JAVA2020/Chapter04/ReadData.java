package Chapter04;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int data = scanner.nextInt();
		System.out.printf("당신이 입력한 숫자는 %d 입니다.\n", data);
		
		

		System.out.print("문자열을 입력하세요: ");
		String str = scanner.next();
		System.out.printf("당신이 입력한 문자열은 %s입니다.\n", str);
		System.out.printf("입력한 첫 문자는 %c 입니다.\n", str.trim().charAt(0));
		

		
//		  System.out.println("문자열을입력하세요:"); 
//		  String str1 = scanner.nextLine();
//		  System.out.printf("당신이 입력한 문자열은 %s입니다. \n", str1);
		 
		  scanner.close();
	}
	
}


