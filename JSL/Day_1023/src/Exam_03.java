@FunctionalInterface
interface MyFunc{
	public void method();
}


public class Exam_03 {

	public static void main(String[] args) {
		MyFunc f1 = null;
		
		f1=()->{
			String str = "JSLHRD";
			System.out.println(str);
		};
		f1.method();
		
		f1=()->System.out.println("Rest Method");
		f1.method();
		
		f1=()->System.out.println("Test");
		f1.method();
	}

}
