import java.io.*;
// 1byte 파일 출력
public class Exam_04 {

	public static void main(String[] args) {
		File f = new File("/Users/uneko/data/abc.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			byte by[] = {66,68,70,72,(byte)'!'};
			fos.write(by);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
