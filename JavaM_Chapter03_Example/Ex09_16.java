package JavaM_Chapter03_Example;

public class Ex09_16 {

	static void func1() {
		System.out.println("void형 메소드는 돌려줄게 없음.");
	}
	
	static int func2() {
		return 100;
	}
	
	public static void main(String[] args) {

		int a;
		
		func1();
		
		a = func2();
		System.out.printf("int형 메소드에서 돌려준 값 ==> %d\n",a);
	}

}
