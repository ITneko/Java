package inner;

/* 중첩클래스
 * - 특정 클래스 내에 또 다른클래스가 정의 되는 것을 의미함
 * 
 * - 이너 클래스의 장점
 * - 이너 클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용 할 수 있음
 * - static 클래스는 제외하고 다른 이너 클래스는 항상 외부클래스를 통해야 생성이 가능
 * 
 * ex) 외부클래스명 $ 내부클래스명
 * 
 * 종류 
 * 멤버클래스 ,static 클래스 . local 클래스 , 익명클래스
 * 
 */

// 멤버클래스
class Outer {
	public class InnnerEx {
		int a =5; 
	}
}

public class InnerEx01 {

	public static void main(String[] args) {
			// 외부 클래스 의 객체를 먼저 생성
		Outer oe= new Outer();
		// 외부를 통해서 내부 클래스를 생성 
		Outer.InnnerEx eee = oe.new InnnerEx();
		Outer.InnnerEx ee1 = new Outer().new InnnerEx();
	}
}
