class D{
	int a=10;
	int b=20;
	
	void print() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

class DD extends D{
	int a=100;
	int b=200;
	int c=300;
	
	@Override //어노테이션(주석처리와 같음)
	void print() {	//오버라이딩(재정의):super클래스의 메소드 이름, 매게변수의 타입과 갯수가 같아야함
		super.print();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		DD d = new DD();
		d.print();
		
	}

}
