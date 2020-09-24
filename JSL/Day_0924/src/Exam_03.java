//지역 중첩 클래스
//클래스를 메소드안에 넣음 >> 메소드가 실행되면 자동으로 객체가 생성 = 독릭접인 객체 생성이 불가

class Outer2 {
	private int x = 100;
	private int y = 200;
	public void disp() {
		class Inner2{
			private int a = 10;
			private int b= 20;
			public void disp_in() {
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("a="+a);
				System.out.println("b="+b);
			}
		}
		Inner2 in2 = new Inner2();
		in2.disp_in();
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		ot.disp();
	}

}
