package grade;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_01 {

	public static void main(String[] args) throws Exception{
		StringTokenizer st = null;
	//	int oxcnt[] = new int[20];
		Scanner sct = new Scanner(System.in);
		System.out.print("정답입력: ");
		String a[] = sct.next().split(",");
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/data2.txt"));
			System.out.print("번호\t이름\t");
			for(int i =1; i<=20; i++) {
				System.out.print(i +"\t");
			}
			System.out.println("점수");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				st = new StringTokenizer(s, " ,-.");
				while(st.hasMoreTokens()) {
					int cnt = st.countTokens();
					System.out.print(st.nextToken()+ "\t"+ st.nextToken());
				//	int tmpcnt[] = new int[20];
					int tmpcnt = 0;
					for(int i=0; i<cnt-2; i++) {
						if(a[i].equals(st.nextToken())) {
							System.out.print("\tO");
							tmpcnt++;
						}else {
							System.out.print("\tX");
						}
					}
					System.out.println("\t"+(tmpcnt*5));
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
