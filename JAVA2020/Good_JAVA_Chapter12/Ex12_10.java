package Good_JAVA_Chapter12;

interface Car10 {
	static final int CAR_COUNT = 0;

	abstract void work();
}

class Sedan10 implements Car10 {
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck10 implements Car10{
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}

public class Ex12_10 {

	public static void main(String[] args) {
		Sedan10 sedan1 = new Sedan10();
		sedan1.work();
		Truck10 truck1 = new Truck10();
		truck1.work();
	}

}
