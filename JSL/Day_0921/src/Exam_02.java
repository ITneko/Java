//생성자의 연속 호출
class B {
	int a;
	int b;

	B(){
		System.out.println("B() 호출");
	}
	
	B(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class BB extends B {
	int c;

	BB() {
		super(1, 2);
		System.out.println("BB() 호출");
	}

	void print() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.print();
	}

}
