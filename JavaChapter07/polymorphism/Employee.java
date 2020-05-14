package polymorphism;

public class Employee extends Person{
	private String department;
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getDetails() {
		return super.getDetails() + "\t부서: " + department;
	}

}
