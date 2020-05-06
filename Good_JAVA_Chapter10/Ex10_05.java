package Good_JAVA_Chapter10;

//서식화된 출력 메소드 사요 예

public class Ex10_05 {

	public static void main(String[] args) {

		int a = 1234;
		float b = 100.12345f;
		char ch = 'k';
		String s = "IT_Cookbook";
		
		System.out.printf("정수의 10진수 ==> %d\n",a);
		System.out.printf("정수의 16진수 ==> %x\n",a);
		System.out.printf("정수의   8진수 ==> %o\n",a);
		System.out.printf("실수 ==> %14.3f\n", b);
		System.out.printf("실수(공학용) ==> %e\n",b);
		System.out.printf("문자 ==> %c\n", ch);
		System.out.printf("문자열 ==> %s\n", s);
	}

}
