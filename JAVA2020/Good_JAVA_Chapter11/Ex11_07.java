package Good_JAVA_Chapter11;

class Ex07Car{
	private String color;
	private int speed;
	
	Ex07Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}

public class Ex11_07 {

	public static void main(String[] args) {
		Ex07Car myCar1 = new Ex07Car("빨강",0);
		Ex07Car myCar2 = new Ex07Car("파랑",30);
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor()+ "이며, 현재속도는 " + myCar1.getSpeed());
		System.out.println("자동차2의 색상은 " + myCar2.getColor()+ "이며, 현재속도는 " + myCar2.getSpeed());
	}

}
