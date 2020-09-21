class E {
	int a = 10;

	void print() {
		System.out.println("a=" + a);
	}
}

final class EE extends E {	//final을 class에 붙이면 상속받지 못함, 마찬가지로 멤버변수나 메소드에 사용하면 상속불가
	int c = 100;

	@Override
	void print() {
		System.out.println("a=" + a);
		System.out.println("c=" + c);		
	}

	void eePrint() {
		System.out.println("c=" + c);
	}
}
class EEE extends E{
	
}


public class Exam_05 {

	public static void main(String[] args) {
		E e = new EE();
		e.a = 100;
		e.print();	//자식이 오버라이딩을 했을경우 자식의 메소드가 호출됨.
		

	}

}
