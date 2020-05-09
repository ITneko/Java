package Good_JAVA_Chapter09;

import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str, strRep, strSub, strAry[]; // 입력받은 문자열,바꿀 문자열, 일부 문자열, 분리한 문자열 배열을 선언

		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();

		strRep = str.replace(" ", "$");
		strSub = str.substring(3, 8);
		strAry = str.split(" ");

		System.out.println("입력 문자열 ==> " + str);
		System.out.println("바꾼 문자열 ==> " + strRep);
		System.out.println("일부 문자열 ==> " + strSub);
		for (int i = 0; i < strAry.length; i++)
			System.out.println("분리한 문자열" + i + "==> " + strAry[i]);
	}

}