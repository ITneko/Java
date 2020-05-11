package Good_JAVA_Chapter11;

public class Ex11_03 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "Km 입니다.");
	}

}
