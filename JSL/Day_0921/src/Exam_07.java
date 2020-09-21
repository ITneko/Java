class Parent {

}

class Child extends Parent {

}

public class Exam_07 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		Child cc = (Child)p;
		if(p instanceof Parent) {	// 변수 instanceof 클래스명 >> 왼쪽에 있는 오브젝트가 해당 클래스와 같은지, 자식인지 판단 
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		System.out.println("-----------");
		if(p instanceof Child) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
	}

}
