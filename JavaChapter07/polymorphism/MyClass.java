package polymorphism;

public class MyClass {
	public void abc(int i, String str) {
		System.out.println("정수와 문자열이 입력됨");
	}
	
	public void abc(double a, double b) {
		System.out.println("부동소수점이 입력됨");
	}
	
	public void abc(String str) {
		System.out.println("문자열이 입력됨");
	}
}
