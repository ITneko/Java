package JavaM_Chapter05_Example;

import java.util.Scanner;

class StackApp implements Stack {
	private String stack[];
	private int top, capacity;

	public StackApp(int capacity) {
		this.capacity = capacity;
		this.top = 0;
		stack = new String[capacity];
	}

	public int length() {
		return top;
	}

	public int capacity() {
		return capacity - top;
	}

	public String pop() { // 출력
		if (top == 0)
			System.exit(0);
		top--;
		return stack[top];
	}

	public boolean push(String val) {
		if (capacity() != 0) {
			stack[top] = val;
			top++;
			return true;
		}
		return false;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("총 스텍 저장 공간의 크기 입력 >>");
		int size = sc.nextInt();
		StackApp stack = new StackApp(size);

		while (true) {
			System.out.print("문자열 입력>>");
			String str = sc.next();

			if (str.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝 :");
				while (true) {
					System.out.print(" " + stack.pop());
				}
			}

			if (!stack.push(str))
				System.out.println("스택이 꽉 차서 푸시 불가!");

		}

	}
}

//총 스텍 저장 공간의 크기 입력 >> 3
//문자열 입력>> hello
//문자열 입력>> sunny
//문자열 입력>> smile
//문자열 입력>> happy
//스택이 꽉 차서 푸시 불가!
//문자열 입력>> 그만
//스택에 저장된 모든 문자열 팝 : smile sunny hello