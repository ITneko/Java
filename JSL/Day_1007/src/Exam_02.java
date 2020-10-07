import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		StringTokenizer st = null;
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/student.txt"));
			System.out.println("번호\t이름\t국어\t영어\t수학\t화학\t전산\t총점\t평균");
			while (sc.hasNextLine()) {
				String s = sc.nextLine(); 
				st = new StringTokenizer(s, " ,-.");
				int sum = 0;
				while(st.hasMoreTokens()) {
					String temp = st.nextToken();
					System.out.print(temp + "\t");
					if(st.countTokens() < 5) {
						sum += Integer.parseInt(temp);
					}
				}
				System.out.print(sum + "\t");
				System.out.println((Math.round(sum*10./5)/10.));
			}

		} catch (Exception e) {
			System.out.println("파일없음");
		}
	}

}
