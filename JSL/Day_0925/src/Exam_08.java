//String : 
public class Exam_08 {

	public static void main(String[] args) {
		//String str = "AAAA";
		String str1 = new String();
		byte[] by = {65,66,67,68};
		String byStr = new String(by);
		String str2 = new String("BBBB");
		
		String strA = "AAAA";
		String strB = "AAAA";
		// StrA,B는 같은 곳을 가르킴.(하나만 만들고 둘이 공유)
		String strC = new String("AAAA");	// StrA,B와 다르게 객체가 새로 만들어짐
		
		if(strA == strC) {	
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
		
	}

}
