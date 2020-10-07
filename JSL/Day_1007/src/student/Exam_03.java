package student;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/*	/Users/uneko/student.txt 파일내용
 *  5,이학생,90,88,79,80,95
 *  .	.	.	.
 *  [출력형식]
 *  번호	이름	국어	영어	수학	화학	전산	총점	평균 석차
 */
public class Exam_03 {

	public static void main(String[] args) throws Exception{
		StringTokenizer st = null;
		int cnt=0;
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/student.txt"));
			while(sc.hasNextLine()) {
				String temp = sc.nextLine();
				cnt++;
			}
		}catch (Exception e) {
			System.out.println("파일없음");
		}
		
		Student student[] = new Student[cnt];
		System.out.println("번호\t이름\t국어\t영어\t수학\t화학\t전산\t총점\t평균\t석차");
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/student.txt"));
			int acnt = 0;
			while(sc.hasNextLine()) {
				String  s = sc.nextLine();
				st = new StringTokenizer(s, " ,.-+");
				String str[] = new String[st.countTokens()];
				while(st.hasMoreTokens()) {
					int ct = st.countTokens();
					for(int i=0; i<ct; i++) {
						str[i] = st.nextToken();
					}
					int val[] = new int[5];
					int sum=0;
					for(int i=0; i<val.length; i++) {
						val[i] = Integer.parseInt(str[i+2]);
						sum+= val[i];
					}
					double ave = Math.round(sum*10./val.length)/10.;
					student[acnt] = new Student((Integer.parseInt(str[0])), str[1], val[0],val[1],val[2],val[3],val[4],sum,ave);
					acnt++;
				}
				
			}
			
			for(int i =0; i<cnt; i++) {
				int rank=1;
				for(int y=0; y<cnt; y++) {
					if(i==0) {
						student[i].setRank(rank);
					}
					if(student[i].getSum() < student[y].getSum()) {
						student[i].setRank(++rank);
					}
				}
			}
			
			for(int i=0; i<cnt; i++) {
				System.out.print(student[i].getBun()+"\t");
				System.out.print(student[i].getName()+"\t");
				System.out.print(student[i].getKor()+"\t");
				System.out.print(student[i].getEng()+"\t");
				System.out.print(student[i].getMat()+"\t");
				System.out.print(student[i].getHwa()+"\t");
				System.out.print(student[i].getDat()+"\t");
				System.out.print(student[i].getSum()+"\t");
				System.out.print(student[i].getAve()+"\t");
				System.out.println(student[i].getRank());
			}
			
		}catch (Exception e) {
			System.out.println("파일없음");
		}
		
	}

}
