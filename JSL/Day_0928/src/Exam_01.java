
public class Exam_01 {

	public static void main(String[] args) {
		String str = "HRD_SKorea_Java_SpringFramework";
		// 문자열 길이
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}

		str = str.concat("123456789");
		System.out.println(str);

		int x = str.indexOf("S"); // 첫번째만찾음
		System.out.println(x);

		x = str.indexOf("S", 5); // 5번째부터 찾음
		System.out.println(x);

		System.out.println(str.contains("F"));	// F가 포함되어 있는지
		
		String s[] = str.split("_");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String date = "   2020  -09-28   ";
		//date = date.trim();	// 앞과 뒤에 있는 공백제거
		date = date.replace(" ", "");	// 치환
		String y = date.substring(0,4);
		String m = date.substring(5,7);
		String d = date.substring(8);
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		
		boolean bool = true;
		String a = bool+" ";
		String aa = String.valueOf(bool);
		System.out.println(a);
		int b = 100;
		String sss = 100+"";
		System.out.println(b);
		int aaa = Integer.parseInt(sss);
		System.out.println(aaa);
	}

}
