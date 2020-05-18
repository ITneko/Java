package ExceptionHandling_;

public class TryCatchExample {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = { "こんにちは", "初めまして", "また来てください" };
		while(i<4) {
			try {
				System.out.println(greetings[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("例外が発生しました。");
				System.out.println("例外の原因は" + e.getMessage());
				System.out.println("例外処理を完了しました。");
			}finally {
				System.out.println("finally文はいつも実行されます");
			}
			i++;
		}
		System.out.println("メインの最後の部分です。");
	}
}