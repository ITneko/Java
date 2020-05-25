package inner;

// 외부 클래스명 . 내부 클래스 생성자 로 객체 생성 가능
public class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner {
		// 어쩔 수 없이 내부 클래스 static 으로 선언해야할 경우
		// 내부 클래스 멤버들 중 하나라도 static으로 선언된 멤버가 있을 경우

		static int d = 1000;

		public void printData() {
//			System.out.println("a : "+a);
	//		System.out.println("b : "+b);
			System.out.println("c : " + c);
		}
	}

	public static void main(String[] args) {

		// 또 다른 독립된 객체에서 static 이너 클래스 생성시 객체 생성
		StaticInner.Inner in = new StaticInner.Inner();
		in.printData();
	}

}
