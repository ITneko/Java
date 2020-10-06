import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_03 {

	public static void main(String[] args) throws Exception{
		StringTokenizer st = null;
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/data.txt"));
			while(sc.hasNextLine()) {
				String ss = sc.nextLine();
				st = new StringTokenizer(ss, " ,-");
				int sum=0;
				while(st.hasMoreTokens()) {
					String temp = st.nextToken();
					System.out.print(temp + "\t");
					
					if(st.countTokens() < 3) 
						sum+= Integer.parseInt(temp);
				}
				System.out.print(sum +"\t");
				System.out.println(Math.round(sum*10./3)/10.);
			}
			
		}catch(Exception e) {
			System.out.println("파일이 없습니다.");
		}
	}

}
