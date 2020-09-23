class Q {
	int a = 100;
	void print() {
		
	}
}

interface W {
	int b = 200;
	void test();
}

interface T{
	int c = 200;
	void test2();
}

class QQ extends Q implements W, T{	
	// 자바는 다중상속을 지원하지 않으므로 클래스Q와 인터페이스W를 동시에 구현, 인터페이스는 동시에 여러개 구현가능

	@Override
	public void test() {
	}

	@Override
	public void test2() {
	}
	
	
}

	

public class Exam_06 {

	public static void main(String[] args) {
		QQ q = new QQ();
		q.a = 100;
		q.print();
		q.test();
	}

}
