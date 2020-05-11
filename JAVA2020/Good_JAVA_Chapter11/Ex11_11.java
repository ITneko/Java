package Good_JAVA_Chapter11;

class Ex11Car{
	String color;
	int speed;
	static private int count = 0;
	
	Ex11Car(){
		count++;
	}
	
	static int getCount() {	//클래스 메소드
		return count;
	}
	
}

public class Ex11_11 {

	public static void main(String[] args) {
		System.out.println("현재 생산된 자동차 숫자 ==> " + Ex11Car.getCount());
		
		Ex11Car myCar1 = new Ex11Car();
		System.out.println("현재 생상된 자동차 숫자 ==> " + myCar1.getCount());
		
	}

}
