package Good_JAVA_Chapter09;

public class Ex09_07 {

	public static void main(String[] args) {

		String str = "  한글   ABCD   efgh   ";
		String result = "";
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != ' ')
				result += str.substring(i,i+1);
		}
		
		System.out.println("원 문자열 ==> [" + str + "]");
		System.out.println("공백제거  ==> [" + result + "]");
	}

}
