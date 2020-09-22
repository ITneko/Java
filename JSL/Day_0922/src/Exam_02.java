abstract class CC{	// 클래스안에 추상메소드가 한개라도 있으면 일반클래스로 사용불가
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
	public abstract void data(); //추상 메소드
}

class CCC extends CC{
	
	@Override
	public void print() {
		super.print();
	}

	@Override
	public void data() {	// 추상 메소드는 무조건 오버라이딩 해줘여하며, 추상 메소드가 아닌 print()는 안적어도 됨
	}
	
}


public class Exam_02 {

	public static void main(String[] args) {

	}

}
