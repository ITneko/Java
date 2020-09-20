package sawon;

//사원정보 객체 생성용
public class Sawon {
	private String department;
	private int bun;
	private String name;
	private int pay;
	
	public Sawon() {}
	public Sawon(String department, int bun, String name, int pay) {
		this.department = department;
		this.bun = bun;
		this.name = name;
		this.pay = pay;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
}
