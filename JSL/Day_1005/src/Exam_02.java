import java.util.Random;

/* 수학함수 Math
 * Math.abs(-10);
 * Math.max(10,20);
 * Math.min(10,20);
 * round()	//반올림
 * cell()	//올림
 * floor()	//내림
 * random()	//난수발생(0~1)
 * 
*/
public class Exam_02 {

	public static void main(String[] args) {
		int a = Math.abs(-10);
		int b = Math.max(20, 10);
		int c = Math.min(20, 10);
		double d = Math.ceil(12.35231);
		double e = Math.floor(32.4213);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		Random rand = new Random();
		System.out.println(rand.nextInt(11));

		int randValue = (int) (Math.random() * 10) + 1;
		System.out.println(randValue);
	}

}
