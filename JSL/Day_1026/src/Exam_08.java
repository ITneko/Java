import java.io.*;
//텍스트 (2바이트)출력
public class Exam_08 {

	public static void main(String[] args) throws Exception{
		File f = new File("/Users/uneko/data/abc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("AAAA");
		pw.println("DDDD");
		pw.println("파일 쓰기 테스트");
		pw.close();
	}

}
