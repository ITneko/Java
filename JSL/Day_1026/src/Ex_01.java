import java.io.*;
public class Ex_01 {

	public static void main(String[] args) {
		//폴더 생성
		File file = new File("C:\\Users\\admin\\java");
		boolean bool = file.exists();
		System.out.println(bool);
		if(!bool) {
			file.mkdir();
			
		}
		
		File f1 = new File(file,"abc.exe");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
