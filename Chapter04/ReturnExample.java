package Chapter04;
//return [표현식 or 변수];
public class ReturnExample {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("넓이는 : " + calcRect(a,b));
	}
	
	public static int calcRect(int width, int height) {
		return(width*height);
	}

}
