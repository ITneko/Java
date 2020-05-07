package Chapter06;

public class Variable {

	int a;
	
	public void printNum(int c) {
		int b = 1;	//반드시 초기화 해야함
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b);
		System.out.println("매개변수 : " + c);
		
	}
}
