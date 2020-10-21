package test01;

public class Student implements Comparable<Student>{
	private String name;
	private int num;
	
	public Student() {
	}
	public Student(int age, String name) {
		this.name = name;
		this.num = age;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(num, o.num);
	}
	
	
	@Override
	public String toString() {
		return num+"\t"+name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return num;
	}
	public void setAge(int age) {
		this.num = age;
	}
	
	
}
