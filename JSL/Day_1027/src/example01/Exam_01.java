package example01;
import java.io.File;
import java.util.Scanner;
//출력
/*	번호	이름	국어	영어	수학	총점	평균
 * 
 */
import java.util.StringTokenizer;

public class Exam_01 {

	public static void main(String[] args)throws Exception {
		StringTokenizer st = null;
		Scanner sc = new Scanner(new File("/Users/uneko/data/student2.txt"));

		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			st = new StringTokenizer(data, " ,");
			int cnt = st.countTokens();
			int sum = 0;
			while(st.hasMoreTokens()) {
				String str[] = new String[cnt];
				for(int i=0; i<cnt; i++) {
					str[i] = st.nextToken();
					System.out.print(str[i] + "\t");
					if(i>1) {
						sum+= Integer.parseInt(str[i]);
					}
				}
				double ave = Math.round(sum*100./3)/100.;
				System.out.println(sum + "\t" + ave);
			}
		}
	}

}
