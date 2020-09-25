/* java.lang.*	/ 패키지 활용
 * 
 */

class A { // 모든 클래스는 Object를 상속받음
	int x = 10;
}

public class Exam_01 {

	public static void main(String[] args) {
//		Object obj = new Object();
		AA a1 = new AA();
		AA a2 = new AA();
		if (a1 == a2) {
			System.out.println("a1==a2");
		} else
			System.out.println("a1!=a2");

		System.out.println(a1);
		System.out.println(a2);
		
		String str1 = "AAA";
		if(str1=="AAA") {
			System.out.println("str1==AAA");
		}else
			System.out.println("str1!=AAA");
	}

}
