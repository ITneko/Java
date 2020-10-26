import java.util.Scanner;
import java.io.*;

/* 키보드로 번호, 이름, 국어, 영어, 수학 점수를 입력 받아 총점과 평균을 구하여 출력
 * [입력형식]
 * 입력:1,김학생,90,88,95
 * 	.	.	.	.	.
 * 입력: -99 종료
 * [출력형식 : /Users/uneko/data/hakexam.txt]
 * 번호 이름 국어 영어 수학 총점 평균
 * .	.	.	.	.	.	.
 * 
 */
public class Exam_10 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		File f = new File("/Users/uneko/data/abc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		while (true) {
			System.out.print("입력: ");
			String str[] = sc.nextLine().split(",");
			if (str[0].equals("-99"))
				break;
			int sum = 0;
			for (int i = 2; i < str.length; i++) {
				sum += Integer.parseInt(str[i]);
			}
			double ave = Math.round(sum*100./3)/100.;
			
			for(int i=0; i<str.length; i++) {
				pw.print(str[i] + "\t");
			}
			pw.println(sum + "\t" + ave);
		}
		pw.close();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
	}

}
