import java.io.File;
import java.util.Scanner;

/*	/Users/uneko/student.txt 파일내용
 *  5,이학생,90,88,79,80,95
 *  .	.	.	.
 *  [출력형식]
 *  번호	이름	국어	영어	수학	화학	전산	총점	평균
 */
public class Exam_01 {

	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(new File("/Users/uneko/data/student.txt"));
			String data = null;
			System.out.println("번호\t이름\t국어\t영어\t수학\t화학\t전산\t총점\t평균");
			while ((data = sc.nextLine()) != null) {
				String ss[] = data.split(",");
				int sum = 0;
				for (int i = 0; i < ss.length; i++) {
					System.out.print(ss[i] + "\t");
					if (i > 1) {
						sum += Integer.parseInt(ss[i]);
					}
				}
				System.out.print(sum + "\t");
				System.out.println(Math.round(sum * 10. / 5) / 10.);
			}
		} catch (Exception e) {
			
		}

	}
}
