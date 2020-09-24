/*	중첩 클래스 : 클래스 내부에 또다른 클래스
 * 	4대 중첩
 * 	1. 중첩클래스(Inner)
 * 	2. 정적중첩
 * 	3. 지역중첩
 * 	4. 익명중첩
 */
//중첩클래스
class Outer {
	int x = 100;	//Inner 클래스와 공유됨
	private int y = 200;
	private static int z = 300;

	public Outer() {
	}

	public void disp() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

	class Inner {
		private int a = 10;
		public void disp_in() {
			System.out.println("x=" + x);
			System.out.println("y=" + y);
			System.out.println("z=" + z);
			System.out.println("a=" + a);
		}

	}
}

public class Exam_01 {

	public static void main(String args[]) {
		//Inner 객체 생성 1
		Outer ot = new Outer();
		Outer.Inner in = ot.new Inner();
		ot.disp();
		System.out.println("==================");
		in.disp_in();
		ot.x = 1000;
		
		//Inner 객체 생성 2
		Outer.Inner in2 = new Outer().new Inner();
		in2.disp_in();
		
		Outer.Inner oi1 = ot.new Inner();
		Outer.Inner oi2 = ot.new Inner();
		oi1.disp_in();
		oi2.disp_in();
		
	}
}
