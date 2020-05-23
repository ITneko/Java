package JavaM_Chapter05_Example;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s;
		Calc calc;
		while (true) {
			System.out.print("두 정수와 연산자를 입력하시오>>");
			a = sc.nextInt();
			b = sc.nextInt();
			s = sc.next();

			switch (s.charAt(0)) {
			case '+':
				calc = new Add();
				calc.setValue(a, b);
				System.out.println(calc.calculate());
				break;
			case '-':
				calc = new Sub();
				calc.setValue(a, b);
				System.out.println(calc.calculate());
				break;
			case '*':
				calc = new Mul();
				calc.setValue(a, b);
				System.out.println(calc.calculate());
				break;
			case '/':
				calc = new Div();
				calc.setValue(a, b);
				try {
					System.out.println(calc.calculate());
				} catch (ArithmeticException ae) {
					System.out.println("0 으로 나누려고 하고 있습니다 .");
					break;
				}
			}

		}
	}
}
