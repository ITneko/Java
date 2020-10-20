package test01;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"\t"+age;
	}
	@Override
	public int compareTo(Person o) {
//		if(age > o.age) {
//			return -1;
//		}else if(age == o.age) {
//			return 0;
//		}else
//			return 1;
		return Integer.compare(age, o.age);
	}
	
	
	
}
