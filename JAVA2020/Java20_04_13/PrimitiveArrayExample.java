package Java20_04_13;

public class PrimitiveArrayExample {

	public static void main(String[] args) {
		char[] s;	// Primitive형 배열 선언
//		char[5] s2;	// 오류 - 선언 시 크기 명시 못함
		
		s = new char[5];	//Primitive형 배열 생성
		s[0] = 'A';
		s[1] = 'B';
		s[2] = 'C';
		s[3] = 'D';
		s[4] = 'E';
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i] + "\t");
		}

	}

}
