
class B {
	String name;
	int age;

	B(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

}

public class Exam_03 {

	public static void main(String[] args) {
		B b1 = new B("홍길동", 28);
		System.out.println(b1);
		System.out.println("이름 : " + b1.name + "\t나이 : " + b1.age);

		String str = new String("홍길동");
		System.out.println(str);
		System.out.println("이름: " + str);
	}

}
