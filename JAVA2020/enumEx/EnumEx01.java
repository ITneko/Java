package enumEx;

/*
 *  enum : 정수를 자동으로 증가하여 상수를 만들어  쓰는 열거체와 비슷 
 *           자바에서 열거형은 상수를 하나의 객체로 인식'
 *           여러개의 상수 객체들을 하나로 묶어서 사용할 수있음
 *
 * 
 *    구성 
 *  - 접근제한자 enum 열거형 명 {
 *    상수 1 , 상수 2 , ......상수 n
 *   }
 * 
 */

public class EnumEx01 {

	public enum Lesson {

		java, Xml, Database, Jsp
	}

	public static void main(String[] args) {
		Lesson a = Lesson.java;
		System.out.println(a);
		System.out.println(Lesson.Jsp);

	}

}