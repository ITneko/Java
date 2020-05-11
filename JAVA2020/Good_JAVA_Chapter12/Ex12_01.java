package Good_JAVA_Chapter12;

class Ex01Car{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
}

class Ex01Sedan extends Ex01Car{
	int seatNum;
	
	int getSedanNum() {
		return seatNum;
	}
}

class Ex01Truck extends Ex01Car{
	int capacity;
	
	int getCapacity() {
		return capacity;
	}
}

public class Ex12_01 {

	public static void main(String[] args) {
		Ex01Sedan sedan1 = new Ex01Sedan();
		Ex01Truck truck1 = new Ex01Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석수는 " + sedan1.getSedanNum() + "개 입니다");
		System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity() + "톤 입니다");
	}

}
