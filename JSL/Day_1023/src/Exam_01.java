interface Test {
	public void method();
}

class TestExam implements Test{

	@Override
	public void method() {
		System.out.println("AAAA");
	}
	
}

public class Exam_01 {

	public static void main(String[] args) {
		Test t1 = new Test() {

			@Override
			public void method() {
				System.out.println("AAAA");
			}
			
		};
		t1.method();
		
		// 람다식
		Test t2=()->System.out.println("BBBB");
		t2.method();
	}

}
