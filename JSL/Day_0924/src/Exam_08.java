// 예외 미루기 throws
// 예외가 있는 메소드를 호출한 쪽에서 처리

class AA{
	public void test() throws Exception {
		System.out.print("AAA: ");
		char ch = (char)System.in.read();
		thorw 
	}
}

public class Exam_08 {

	public static void main(String[] args) {
		AA a = new AA();
		try{
			a.test();
		}catch(Exception e) {}
//		System.in.read();
	}

}
