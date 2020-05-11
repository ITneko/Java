package Good_JAVA_Chapter12;

class Ex06Car{
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed = speed;
		System.out.println("현재속도(슈퍼클래스): " + this.speed);
	}
}

class Ex06Sedan extends Ex06Car{
	void upSpeed(int speed) {
		super.upSpeed(speed);
		this.speed += speed;
		if(this.speed > 150)
			this.speed = 150;
		System.out.println("현재속도(서브클래스): " + this.speed);
	}
}

class Ex06Truck extends Ex06Car{
}

public class Ex12_06 {

	public static void main(String[] args) {
		Ex06Truck truck1 = new Ex06Truck();
		Ex06Sedan sedan1 = new Ex06Sedan();
		
		System.out.print("트럭 --> ");
		truck1.upSpeed(200);
		
		System.out.print("승용차--> ");
		sedan1.upSpeed(200);
	}

}
