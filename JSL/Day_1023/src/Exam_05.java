@FunctionalInterface
interface MyFunc3{
	public int exam(int x, int y);
}

public class Exam_05 {

	public static void main(String[] args) {
		MyFunc3 f3;
		f3=(x,y)->x+y;	// return을 사용할 필요가 없음
		System.out.println(f3.exam(10, 20));
		
		f3=(x,y)->sum(x,y);
	}
	
	static int sum(int x, int y) {
		return x+y;
	}

}
