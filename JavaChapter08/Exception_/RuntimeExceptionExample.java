package Exception_;

public class RuntimeExceptionExample {

	public static int makeException1(int input) {
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {
		String s = "あ";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception{
		int[] a= {1,2,3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt = "あいう";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	
	public static void makeException7() {
		Object[] objArr = new String[3];
		objArr[0] = 0; //宣言自体は objectになっているのでコンパイルエラーは発生しない。
	}
	
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];
	}
	
	public static void main(String[] args) throws Exception{
		//Runtime Exceptionも結局 try catchしてこそプログラムが止まらない。
		makeException1(4);
		makeException2();
		makeException3();
		makeException4();
		makeException5();
		makeException6();
		makeException6();
		makeException7();
		makeException8();
	}

}
