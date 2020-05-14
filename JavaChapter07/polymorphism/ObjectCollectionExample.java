package polymorphism;

public class ObjectCollectionExample {

	public static void main(String[] args) {
		Object[] objArr = new Object[5];
		
		objArr[0] = new Person("홍길동", 30);
		objArr[1] = new Student("홍학생", 25, "20001234");
		objArr[2] = new Integer(100);
		objArr[3] = new String("Hello");
		objArr[4] = new java.util.Date();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
		}
//		for(Object obj : objArr) {
//			System.out.println(obj);
//		}
	}

}
/*
 * System.out.println()를 통해 객체를 출력하려고하면 .toString()을 붙여준다.
 * 예시에서 Integer, String, Date 클래스는
 * toString()을 재정의했기때문에 객체들의 값이 출력이 되고 
 * Person, Student는 재정의하지 않았기 때문에 주소값이 출력이 된것이다.
*/
