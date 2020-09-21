package student;

public class Student {
	int bun;
	String name;
	int age;
	
	Student(){}
	Student(int bun, String name, int age){
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	public void studentPrint() {
		System.out.print(bun+"\t");
		System.out.print(name+"\t");
		System.out.print(age+"\t");
	}
	
}


