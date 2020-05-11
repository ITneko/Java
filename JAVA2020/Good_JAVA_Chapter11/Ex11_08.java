package Good_JAVA_Chapter11;

class Ex08Car{
	private String color;
	private int speed;
	
	Ex08Car(){
	}
	
	Ex08Car(String color){
		this.color = color;
	}
	
	Ex08Car(String color, int speed){
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

public class Ex11_08 {

	public static void main(String[] args) {
		Ex08Car myCar1 = new Ex08Car();
		Ex08Car myCar2 = new Ex08Car("빨강");
		Ex08Car myCar3 = new Ex08Car("파랑", 30);
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor()+ "이며, 현재속도는 " + myCar1.getSpeed());
		System.out.println("자동차2의 색상은 " + myCar2.getColor()+ "이며, 현재속도는 " + myCar2.getSpeed());
		System.out.println("자동차3의 색상은 " + myCar3.getColor()+ "이며, 현재속도는 " + myCar3.getSpeed());
	}

}
