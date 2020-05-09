package Chapter04;

import java.util.Random;	//Math.random() 0 부터 1 미만의 값이 출력됨(1 출력 안됨)

public class RandomExample {

	public static void main(String[] args) {

		Random rand = new Random();	
		//각 타입별로 난수를 발생시키는 메서드가 존재, Seed를 지정할 수 있다. 
		//Seed가 같은 Random 객체는 동일한 순서로 난수를 발생시킨다.
		
		float a = rand.nextFloat(); //0.0이상 1.0미만의 float형 난수 발생
		boolean b = rand.nextBoolean();	//true or false 중 임의값 발생
		int c = rand.nextInt();	//int형 타입 이내의 모든 값에서 난수값 발생
		int d = rand.nextInt(10);	//0부터 생성자에 들어간 (숫자-1) 까지의 int형 난수값 발생
		System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
//		int randValue = (int)(Math.random() * 10) + 1;
//		또는
//		Random rand = new Random();
//		int randValue = rand.nextInt(11);
	}	
	
}
