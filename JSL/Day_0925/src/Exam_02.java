/* java.lang.*	/ 패키지 활용
 * 
 */

class AA { // 모든 클래스는 Object를 상속받음
	int x = 10;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			AA a = (AA)obj;
			return x==a.x;
		}else {
			return false;
		}
	}
	
}

public class Exam_02 {

	public static void main(String[] args) {
//		Object obj = new Object();
		AA a1 = new AA();
		AA a2 = new AA();
		if (a1 == a2) {
			System.out.println("a1==a2");
		} else
			System.out.println("a1!=a2");
		
		if (a1.equals(a2)) {
			System.out.println("같은 객체입니다");
		} else
			System.out.println("다른 객체입니다");


		System.out.println(a1);
		System.out.println(a2);
		
		
	}

}
