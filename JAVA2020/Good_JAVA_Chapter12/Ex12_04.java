package Good_JAVA_Chapter12;

class Ex04Car{
	private String color;
	int speed;
}

class Ex04Sedan extends Ex04Car{
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/* (color는 상속받지 못하므로 오류발생)
	 * void setColor(String color) { 
	 * this.color = color; 
	 * }
	 */
}

public class Ex12_04 {

	public static void main(String[] args) {
		Ex04Sedan sedan1 = new Ex04Sedan();
		
		sedan1.setSpeed(300);
		System.out.println("승용차 속도 ==>" + sedan1.speed);
	}

}
