
interface C {
	void print();
}

class CC implements C {

	@Override
	public void print() {
		System.out.println("CCC");
	}

}

public class Exam_04 {

	public static void main(String[] args) {	
		C c;
		c = new CC();
		c.print();
		
		//익명 구현 객체
		C cc = new C() {

			@Override
			public void print() {
				System.out.println("익명 구현 객체");
			}
		};
		cc.print();
	}

}
