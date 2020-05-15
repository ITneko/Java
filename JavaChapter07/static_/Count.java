package static_;

public class Count {
	public int a = 0;
	public static int b=0;
	
	public static int DoIt() {
//		return ++a;	//Cannot make a static reference to the non-static field a
		return ++b;
	}
}
