package inner;

public class LocalInner {

	static int a = 10; // 멤버 변수(클래스 변수)
	int b = 20; // 전역변수, 멤버변수

	// 첫번째 메소드
	void write() {

		System.out.println("write() ......1");
		final int c = 30; // 지역변수이면서 상수화된 변수 (값은 불변 (고정))
		int d = 40;

		/*
		 * 변수 c d 는 둘다 지역변수이다. c는 final 변수이기 때문에 두번째 write () 메소드에서 언제든지 접근할때 고정된 값을 보장함
		 * 그래서 접근이 가능
		 * 
		 * 
		 * 반면 b 는 인스턴스 변수이므로 언제든지 변할 수 있는 변수 LocalEx 클래스 의 인스턴스가 생성할 시점을 보장 할 수 없기 때문에
		 * 접근이 불가
		 * 
		 */

		class LocalEx { // 로컬클래스

			// 두번째 메소드
			void write() {

				System.out.println("write () .....2");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);
			}

		}// 내부 클래스 끝

		// 첫번째 write () 메소드에서 생성한 인스턴스
		LocalEx ob1 = new LocalEx();
		ob1.write();
	}

	public static void main(String[] args) {

		LocalInner a = new LocalInner();
		a.write(); // 첫번째
	}
}
