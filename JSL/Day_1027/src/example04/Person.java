package example04;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String tel;
	private int age;

	public Person() {
	}

	public Person(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String toString() {
		return name+"\t"+tel+"\t"+age;
	}
	
	
}
