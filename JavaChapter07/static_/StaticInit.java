package static_;

public class StaticInit {
	static {
		System.out.println("static initializer가 수행됨");
	}
	
	public StaticInit() {
		System.out.println("Constructor 호출됨");
	}
}
