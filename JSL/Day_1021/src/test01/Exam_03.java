package test01;
// map은 hashcode랑 equals 오버라이딩해야하지만 TreeMap은 자동정렬이라 안해도됨
import java.util.*;

class Person implements Comparable<Person>{
	String name;
	int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}
	
	
}

public class Exam_03 {

	public static void main(String[] args) {
		TreeMap<Person, Integer> map = new TreeMap<Person, Integer>();
		map.put(new Person("이학생",24), 95);
		map.put(new Person("박학생",30), 90);
		map.put(new Person("강학생",27), 75);
		map.put(new Person("오학생",28), 85);
		map.put(new Person("윤학생",25), 65);
		
		
		Set<Person> set = map.keySet();
		System.out.println("for()을 이용한 키, 값 출력");
		for(Person key : set) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("\n반복자를 이용한 출력");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Person key = (Person)iter.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
