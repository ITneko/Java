package ExceptionHandling_;

public class ThrowsExample {

	private static String[] greetings = {"안녕","Hi","こんにちは"};
	
	public static void doIt(int index)throws ArrayIndexOutOfBoundsException{
		System.out.println(greetings[index]);
	}
	
	public static void main(String[] args) {
		int i = (int)(Math.random()*4);
		try {
			doIt(i);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("iの数値が正しくありません。次の命令文を実行します。");
		}
		System.out.println("次の命令文を実行しました");
	}

}
