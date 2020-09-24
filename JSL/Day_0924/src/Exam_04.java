//익명 중첩 클래스
/* 기존 클래스의 특정 메소드를 오버라이딩하여(재정의) 사용
 * 익명 중첩 클래스는 새로운 메소드를 추가할 수 없다.
 */

class Inner3{
	public void aaa() {
		System.out.println("AAAAAAAA");
	}
	public void bbb() {
		System.out.println("BBBBBBBB");
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		Inner3 in3 = new Inner3();
		in3.aaa();
		
		Inner3 in4 = new Inner3() {
			@Override
			public void aaa() {
				System.out.println("AAAABBBB");
			}
//			public void ccc() {
//				System.out.println("CCCC");
//			}
		};
		in4.aaa();
		
	}

}
