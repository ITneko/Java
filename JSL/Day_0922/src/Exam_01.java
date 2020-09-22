//추상클래스 : 실체가 없는 클래스(객체 생성 불가), 미완성 클래스
//목적 : 통일(필드, 메소드)
class AA{
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
}

abstract class BB{
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
}

class BBB extends BB{
	
}

public class Exam_01 {

	public static void main(String[] args) {
		AA a = new AA();
		
//		BB b = new BB();
		BBB bb = new BBB();
		bb.a = 100;
		bb.print();
		
	}

}
