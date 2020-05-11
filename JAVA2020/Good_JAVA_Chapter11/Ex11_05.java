package Good_JAVA_Chapter11;

class Car2 {
	private int speed = 0;

	public void upSpeed(int value) {
		if (speed + value > 200)
			speed = 200;
		else
			this.speed += value;

		System.out.println("현재 속도 ==>" + getSpeed());
	}

	public void downSpeed(int value) {
		if(speed - value < 0) 
			speed = 0;
		else
			this.speed -= value;
		
		System.out.println("현재 속도 ==>" + getSpeed());
	}

	public int getSpeed() {
		return this.speed;
	}

}

public class Ex11_05 {

	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
	}

}
