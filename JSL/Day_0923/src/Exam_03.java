
public class Exam_03 {
	static void test(Control c) {
		c.turnOn();
		c.turnOff();
		c.setMute(false);
	}
	public static void main(String[] args) {
		Control rc;
		rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		Control.changeBattery();
		
		test(new Tv());
		
		test(new Audio());
		
	}

}
