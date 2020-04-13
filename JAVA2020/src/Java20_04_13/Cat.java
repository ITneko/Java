package Java20_04_13;

public class Cat {
	int age;
	String name;
	Cat(int age, String name){
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return name + "," + age;
	}

}
