//상속(inheritance) : 생성자와 private를 제외한 멤버 변수, 메소드만 상속가능
class A {
	int a = 10;// 멤버(인스턴스) 변수
	int b = 20;

	public void print() {// 멤버(인스턴스)메소드
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}

class AA extends A {
	int c=20;
	
	public void data() {
		System.out.println("c="+c);
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.a = 100;
		a.b = 200;
		a.print();

		AA aa = new AA();
		aa.print();
		aa.a = 100;
		aa.b = 200;
		aa.print();
		aa.data();
	}

}
