package Java20_04_12;

public class MemberVariableExample {
	int a; //멤버변수(인스턴트 변수)
	static int b; // 멤버변수(클래스 변수), static이라 초기화안해도 기본값으로 초기화됨
	public static void main(String[] args) {
	//  System.out.println(a);//error
		System.out.println(b);
	}
}

