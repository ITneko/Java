@FunctionalInterface
interface MyFunc2{
	public void test(int x);
}

public class Exam_04 {

	public static void main(String[] args) {
		MyFunc2 f2;
		
		f2=(x)->{
			int r = x*x;
			System.out.println(r);
		};
		f2.test(5);
	}

}
