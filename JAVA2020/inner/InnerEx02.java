package inner;

class InnerOuterEx {
	static int a = 20;
	int b = 10;

	// 내부 클래스 정의
	public class InnerNest {
		int c = 30;

		public void write() {
			System.out.println("a :" + a);
			System.out.println("b :" + b);
			System.out.println("c :" + c);
		}
	}

	public void write() {
		InnerNest myInner1 = new InnerNest();
		myInner1.write();
	}

}

public class InnerEx02 {

	public static void main(String[] args) {

		InnerOuterEx eee = new InnerOuterEx();

		eee.write();
		System.out.println();
		InnerOuterEx.InnerNest myinner2 = eee.new InnerNest();

		myinner2.write();
		System.out.println();

//		InnerOuterEx.InnerNest myone = new InnerOuterEx().InnerNest();
		// 에러이유 : 외부클래스를 개체를 사용하지 않고 단독으로 객체를 생성하려 했기 때문
//		myone.write();
	}
}
