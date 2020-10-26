import java.io.*;
//텍스트 입력
public class Exam_09 {

	public static void main(String[] args) throws Exception{
		File f = new File("/Users/uneko/data/abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

}
