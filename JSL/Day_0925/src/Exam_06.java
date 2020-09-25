import java.util.Arrays;

//clone() : 자신을 복제하여, 새로운 인스턴스를 생성
//사용자가 만든 클래스는 복제가 안되지만, 기본 자료형은 가능
//Cloneable 인터페이스를 구현해줘야 사용자 클래스도 복제가능
public class Exam_06 {

	public static void main(String[] args) {
		int a[] = {10,20,50,40,60,50,66};
		int b[] = new int[a.length];
		for(int x=0; x<a.length; x++) {
			b[x] = a[x];
		}
		
		int c[] = a.clone();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		String str[] = {"aaa","bbb","ccc"};
		String str2[] = str.clone();
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
	}

}
