package Good_JAVA_Chapter12;

abstract class Car08{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan08 extends Car08{
	
}

class Truck08 extends Car08{
	
}

public class Ex12_08 {

	public static void main(String[] args) {

//		Car08 car = new Car(); 추상 클래스 Car는 인스턴스를 만들 수 없다
		Sedan08 sedan1 = new Sedan08();
		System.out.println("승용차 인스턴스 생성");
		Truck08 truck1 = new Truck08();
		System.out.println("트럭 인스턴스 생성");
	
	}

}
