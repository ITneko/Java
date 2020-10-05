/*	동적인 문자열 처리 클래스
 * 	StringBuffer : 멀티 스레드 지원(동기화 지원)
 *  - 기본크기 16
 *  - 크기를 벗어난 값을 입력하면 크기가 자동으로 늘거나 줄어들음
 *  
 * 	StringBuilder : 싱글 스레드
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(10);	//버퍼의 크기
		str1.append("Korea");
		str1.append("1234567890");
		System.out.println(str1);
		System.out.println("str1 buffersize : " + str1.capacity());
		System.out.println("str1 문자열의 길이 : " + str1.length());
		str2.append("12345678901");
		System.out.println("str2 buffersize : " + str2.capacity());
		System.out.println("str2 문자열의 길이 : " + str2.length());
		
		str1.appendCodePoint(67);
		str1.insert(1, "AA");
		str1.delete(3, 6);
		str1.deleteCharAt(5);
		str1.replace(4, 7, "BBBBB");
		str1.reverse();
		
		
		System.out.println(str1);
		
	}

}
