package ExampleJava20_04_13;

public class Ex03_11 {

	public static void main(String[] args) {
		
		float a = 0.1234567890123456789012345f;	// float형 변수 a에 정밀도 25자리입력
		double b = 0.1234567890123456789012345;	// double형 변수 b에 정밀도 25자리 입력
		
		System.out.printf("%30.25f \n", a);
		System.out.printf("%30.25f \n", b);

	}

}
