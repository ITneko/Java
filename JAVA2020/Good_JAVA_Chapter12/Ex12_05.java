package Good_JAVA_Chapter12;

class Ex05Car{
	protected String color;
	int speed;
}

class Ex05Sedan extends Ex05Car{
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}

public class Ex12_05 {

	public static void main(String[] args) {
		Ex05Sedan sedan1 = new Ex05Sedan();
		
		sedan1.setSpeed(300);
		sedan1.setColor("빨강");
		System.out.println("승용차 속도 ==> " + sedan1.speed);
		System.out.println("승용차 색상 ==> " + sedan1.color);
	}

}
