package Good_JAVA_Chapter12;

class Car07{
	int speed = 0;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan07 extends Car07{
	final static String CAR_TYPE = "승용차";
	
//	void upSpeed(int speed) {
//		재정의한 메소드 내용
//	} 슈퍼클래스의 upSpeed를 오버라이딩하면 오류발생
}

public class Ex12_07 {

	public static void main(String[] args) {
		System.out.println("Sedan 클래스 타입 =>" +Sedan07.CAR_TYPE);
	}

}
