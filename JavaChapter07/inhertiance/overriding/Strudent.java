package inhertiance.overriding;

public class Strudent extends Person {
	protected String studentId;

	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t학번: " + studentId;
	}
}
