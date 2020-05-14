package polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		Person p;
		
		p = new Teacher("홍선생", 22, "Java Programming");
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Teacher);
		System.out.println(p.getDetails());
		
		p = new Employee("홍사원", 23, "교무처");
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Employee);
		System.out.println(p.getDetails());
		
		p = new Student("홍학생", 17, "20160001");
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println(p.getDetails());
		p.walk();
		//p.study();
		//p는 다형적 객체이다. 부모클래스에 있는 메서드만 사용할 수 있다.
	}

}
