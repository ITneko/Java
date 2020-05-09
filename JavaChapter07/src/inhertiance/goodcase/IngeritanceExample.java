package inhertiance.goodcase;

public class IngeritanceExample {

	public static void main(String[] args) {
		Person p1 = new Person("아무개", 20);
		Person p2 = new Person(20, "아무개");
		// p1.name;
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());

		Student s1 = new Student("홍길동", 18, "20160001");
		System.out.println(s1.getDetails());

		Teacher t1 = new Teacher("이순신", 45, "자바프로그래밍");
		System.out.println(t1.getDetails());

		Employee e1 = new Employee("김명주", 30, "교무처");
		System.out.println(e1.getDetails());

	}

}
