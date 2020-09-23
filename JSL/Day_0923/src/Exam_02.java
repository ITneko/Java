interface B{
	public int add(int m, int n);
	
	public void mul(int m, int n);
	
	default void print() {
		System.out.println("인터페이스 테스트");
	}
}

class BB implements B{

	@Override
	public int add(int m, int n) {
		return m+n;
	}

	@Override
	public void mul(int m, int n) {
		System.out.println((m*n));
	}

	@Override
	public void print() {
		B.super.print();
		System.out.println("구형객체 테스트입니다.");
	}
	
}

class BBB implements B{

	@Override
	public int add(int m, int n) {
		return 0;
	}

	@Override
	public void mul(int m, int n) {
	}

	@Override
	public void print() {
		B.super.print();
	}
	
}

public class Exam_02 {

	public static void main(String[] args) {
		B b = new BB();
		int s = b.add(5, 9);
		System.out.println(s);
		b.mul(4, 2);
		b.print();
		
		b = new BBB();
	}

}
