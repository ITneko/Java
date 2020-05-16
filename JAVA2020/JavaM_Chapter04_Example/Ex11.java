package JavaM_Chapter04_Example;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		String s;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = sc.nextInt();
		b = sc.nextInt();
		s = sc.next();
		if(s.charAt(0)=='+') {
			Ex11Add exCalc = new Ex11Add();
			exCalc.setValue(a, b);
			System.out.println(exCalc.calculate());
		}else if(s.charAt(0)=='-') {
			Ex11Sub exCalc = new Ex11Sub();
			exCalc.setValue(a, b);
			System.out.println(exCalc.calculate());
		}else if(s.charAt(0)=='*') {
			Ex11Mul exCalc = new Ex11Mul();
			exCalc.setValue(a, b);
			System.out.println(exCalc.calculate());
		}else if(s.charAt(0)=='/') {
			Ex11Div exCalc = new Ex11Div();
			exCalc.setValue(a, b);
			System.out.println(exCalc.calculate());
		}
		
		
	}

}
