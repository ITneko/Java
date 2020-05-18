package Exception_;

import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) {

		System.out.println("データを入力されるプログラムです。");
		
		byte[] data = new byte[100]; //一度に100byteづつ読み込む
		
		//基本的にSystem.in.readは一つづつ読み込むのでtry　catchを使わないとエラーが発生する
		try {System.in.read(data);}	
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("入力された文字列：");
		System.out.println(new String(data).trim());
		
	}

}
