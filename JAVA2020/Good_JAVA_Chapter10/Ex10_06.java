package Good_JAVA_Chapter10;

//표준 입력 사용 예

import java.util.Scanner;

public class Ex10_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		String str1, str2;
		
		System.out.printf("byte  : "); a = sc.nextByte();
		System.out.printf("short : "); b = sc.nextShort();
		System.out.printf("int   : "); c = sc.nextInt();
		System.out.printf("long  : "); d = sc.nextLong();
		System.out.printf("float : "); e = sc.nextFloat();
		System.out.printf("Double: "); f = sc.nextDouble();
		System.out.printf("str1  : "); str1 = sc.next();
		System.out.printf("str2  : "); str2 = sc.nextLine();
	}

}
