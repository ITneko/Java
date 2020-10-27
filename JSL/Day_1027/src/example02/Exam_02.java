package example02;

import java.io.*;
//입출력 스트림을 이용한 성적처리
import java.util.StringTokenizer;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/uneko/data/student2.txt")));
		StringTokenizer st = null;
		String data = "";
//		while (true) {
//			data = br.readLine();
//			if (data == null) {
//				break;
//			}
//		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while ((data = br.readLine()) != null) {
			st = new StringTokenizer(data, " ,");
			int cnt = st.countTokens();
			String str[] = new String[cnt];
			int sum = 0;
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
