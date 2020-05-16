package interface_;

public class InterfaceMemberExample implements ISomething {
	public void run() {
//		MY_INT = 33;	//Error = ISomething 인터페이스의 final 변수임
		System.out.println("run() : " + ISomething.A);
	}
	
	public static void main(String[] args) {
		System.out.println(ISomething.my_INT);
		System.out.println(InterfaceMemberExample.my_INT);
		ISomething is = new InterfaceMemberExample();
		is.run();
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();
	}

}
