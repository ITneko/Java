import java.text.DecimalFormat;

public class Exam_01 {

	public static void main(String[] args) {
		int a = 1234567;
		DecimalFormat df = new DecimalFormat("₩#,###.00");
		String s = df.format(a);
		System.out.println(s);
		try {
			Number ss = df.parse(s);
			System.out.println(ss);
		} catch (Exception e) {
			
		}
	}

}
