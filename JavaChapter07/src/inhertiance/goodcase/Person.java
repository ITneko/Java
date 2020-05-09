package inhertiance.goodcase;

public class Person {
	// 생성자나 setter메소드가 필요
	public String name;
	public int age;

	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

	// 인수순서가 다르면 다른 생성자임
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 생성자의 첫 라인에는 반드시 super()나 this()가 와야함
	public Person(String name) {
		this(name, 1);
	}

	public Person() {
		this("이름없음", 1);
	}

	public String getDetails() {
		return "이름: " + name + "\t나이: " + age;
	}
	
	public String toString() {
		return "Person [name=" + name +
		", age=" + age + "]";
		}
}
