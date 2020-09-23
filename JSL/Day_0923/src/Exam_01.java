//추상클래스 : 미완성 설계도,	==상속
//인터페이스 : 기본 설계도, 공통적으로 이용하는 기능만 정의해놓음, ==구현
//두가지 모두 다형성을 위해 사용됨
/*
 * 	일반 맴버변수 사용불가, 상수만 정의가능
 *  
 */
interface AA{	//jdk1.7업데이트 이후부터 적용됨
				//인터페이스에 들어가는 메소드는 기본적으로 추상메소드이기 때문에 abstract을 따로 적어줄 필요가 없음
	public static final double PI=3.14; //상수
	
	public void method(); //추상 메소드
	
	default void method1() {	//디폴드 메소드, 공통적으로 가져야할때 주로씀
		
	}
	
	static void method2(int x, int y) {	//정적 메소드
		
	}
	
}

interface AAB extends AA{
	
}

class AAA implements AA{

	@Override
	public void method() {
	}

	@Override
	public void method1() {

	}
	
}

public class Exam_01 {

	public static void main(String[] args) {
		AAA a = new AAA();
//		AA aa = new AA();
	}

}
