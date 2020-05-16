package Ex01;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double calcArea(); 
	
}
