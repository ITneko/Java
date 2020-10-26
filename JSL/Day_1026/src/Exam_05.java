import java.io.*;

public class Exam_05 {

	public static void main(String[] args) {
		File f = new File("/Users/uneko/data/abc.txt");

		try {
			FileInputStream fis = new FileInputStream(f);
			byte by[] = new byte[1024];
			int count = fis.read(by);
			for (int i = 0; i < count; i++) {
				System.out.println(i + " : " + (char) by[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}