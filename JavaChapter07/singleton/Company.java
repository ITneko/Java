package singleton;

public class Company {
	private String str;
	private static Company c = new Company();
	
	private Company() {
		str = "company";
		System.out.println(str);
	}
	
	public static Company getCompany() {
		return c;
	}
}
