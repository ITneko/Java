package inner;

abstract class TestAbst {
	int data = 10000;

	abstract void printdata(); // 추상 메소드
}

public class AnonyInner {

//  미 완성인 메소드를 완성

	TestAbst inn = new TestAbst() {
		@Override
		void printdata() {
			System.out.println("data : " + data);
		}
	};

	public static void main(String[] args) {

		AnonyInner a = new AnonyInner();

		a.inn.printdata();
	}
}
