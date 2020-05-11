package Good_JAVA_Chapter11;

class Ex10Car{
	String color;
	int speed;
	static int count = 0;	
	
	/*
	 * 필드의 인스턴스 변수는 인스턴스를 생성해야 공간이 할당 되지만 
	 * static을 사용하면 클래스 변수가 되며, 이 변수는 클래스 자체에 공간이 할당되서 
	 * 인스턴스를 생성해도 인스턴스에 속하지 않고 클래스에 남아 있음
	*/
	
	Ex10Car(){
		count++;
	}
}

public class Ex11_10 {

	public static void main(String[] args) {
		Ex10Car myCar1 = new Ex10Car();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.count);
		
		Ex10Car myCar2 = new Ex10Car();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar2.count);
		
		Ex10Car myCar3 = new Ex10Car();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar3.count);
	}

}
