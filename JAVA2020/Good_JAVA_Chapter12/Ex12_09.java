package Good_JAVA_Chapter12;

abstract class Car09{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
	abstract void work();
}

class Sedan09 extends Car09{
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck09 extends Car09{
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}



public class Ex12_09 {

	public static void main(String[] args) {
		Sedan09 sedan1 = new Sedan09();
		sedan1.work();
		Truck09 truck1 = new Truck09();
		truck1.work();
	}

}
