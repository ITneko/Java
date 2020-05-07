package oopManager;

public class Customer {

	private String name;
	private String gender;
	private String email;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String toString() {
		return "[이름=" + name + ", 성별 =" + gender + ", 이메일=" + email + ", 생년월일=" + birthYear + "]";
	}

}
