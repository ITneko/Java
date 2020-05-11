package Good_JAVA_Chapter11;

class Ex06Car{
	private String color;
	private int speed;
	
	Ex06Car(){
		color = "빨강";
		speed = 0;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
}

public class Ex11_06 {

	public static void main(String[] args) {
		Ex06Car myCar1 = new Ex06Car();
		Ex06Car myCar2 = new Ex06Car();
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor()+ "이며, 현재속도는 " + myCar1.getSpeed());
		System.out.println("자동차2의 색상은 " + myCar2.getColor()+ "이며, 현재속도는 " + myCar2.getSpeed());
	}

}
