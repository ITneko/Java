package polymorphism;

public class Student extends Person{
	private String studentId;
	
	public Student(String name, int age, String studentId) {
		super(name,age);
		this.studentId = studentId;
	}
	
	public String getDetails() {
		return super.getDetails() + "\t학번: " + studentId;
	}
	
	public void study() {
		
	}
}
