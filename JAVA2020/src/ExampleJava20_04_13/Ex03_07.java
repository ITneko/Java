package ExampleJava20_04_13;

public class Ex03_07 {

	public static void main(String[] args) {
		int a;
		float b;
		
		a=(int)123.45f;	// 바람직하지 않다. 오류를 방지하기 위해 int를 붙여서 정수로 변환함.
		b= 200;			// 실수형 변수에 정수를 대입하는 것은 바람직하지 않음. 200.f (float)200
		
		System.out.printf("a의 값 ==> %d\n", a);
		System.out.printf("b의 값 ==> %f\n", b);

	}

}
