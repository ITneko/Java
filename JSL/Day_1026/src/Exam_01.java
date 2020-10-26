import java.io.*;
public class Exam_01 {
//폴더 생성
	public static void main(String[] args) {
		File file = new File("/Users/uneko/data2");
		boolean bool = file.exists();
		System.out.println(bool);
		if(!bool) {
			file.mkdir();
		}
		
		File f1 = new File(file, "abcd.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
