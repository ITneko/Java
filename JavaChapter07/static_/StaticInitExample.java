package static_;

public class StaticInitExample {

	public static void main(String[] args) {
		StaticInit s1 = new StaticInit();
		System.out.println(s1);
		StaticInit s2 = new StaticInit();
		System.out.println(s2);
		System.out.println("main() 메서드 종료");
	}

}
