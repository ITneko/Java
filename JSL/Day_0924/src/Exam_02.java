//정적 중첩 클래스

//1.정적 중첩 클래스에선 Outer1의 static 맴버를 제외한 일반맴버는 중첩 클래스에 포함 할 수 없음
class Outer1 {
	private int x = 100;	//<<주석1
	private static int y = 200;

	public void disp() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

	static class Inner1 {
		private int a = 10;
		private static int b = 20;
		static int c = 20;

		public void disp_in() {
//			System.out.println("x=" + x);	//<<주석1
			System.out.println("y=" + y);
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		}
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		Outer1 ot = new Outer1();
//		Outer1.Inner1 oi = ot.new Inner1(); // 정적중첩클래스는 객체생성방법이 다름
		Outer1.Inner1 oi = new Outer1.Inner1();
		ot.disp();
		oi.disp_in();
		
		System.out.println("c=" + Outer1.Inner1.c);
		
	}

}
