package Good_JAVA_Chapter09;

public class Ex09_04 {

	public static void main(String[] args) {

		String str = "Javaの勉強中, Javaは面白い。^^";
		
		System.out.println("문자열 ==> " + str);
		
		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(str.indexOf("Java")); // "Java" 글자가 처음 나오는 위치를 출력한다.
		System.out.print("마지막에 나오는 Java 위치 ==> ");
		System.out.println(str.lastIndexOf("Java")); // "Java"글자가 마지막 나오는 위치를 출력한다.
	}

}