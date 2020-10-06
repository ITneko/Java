import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_03 {

	public static void main(String[] args) throws Exception {
		StringTokenizer st = null;
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/data.txt"));
			while (sc.hasNextLine()) {
				String ss = sc.nextLine();
				st = new StringTokenizer(ss, ", -");
				int val[] = new int[3];
				while (st.hasMoreTokens()) {
					String temp = st.nextToken();
					System.out.print(temp + "\t");
					if(st.countTokens() < 3 ) {
						val[st.countTokens()] = Integer.parseInt(temp);
					}
				}
				int sum = val[0]+val[1]+val[2];
				System.out.print(sum + "\t" + Math.round(sum*10./3)/10.);
				System.out.println();
				
				
			}
		} catch (Exception e) {
			System.out.println("파일없음");
		}
	}

}
