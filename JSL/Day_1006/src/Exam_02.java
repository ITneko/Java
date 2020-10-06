import java.io.File;
import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("/Users/uneko/JAVA/JavaWorks/Day_1006/src/Exam_01.java"));
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}
