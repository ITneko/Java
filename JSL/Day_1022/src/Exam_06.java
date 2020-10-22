import java.awt.*;

public class Exam_06 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("NO");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("YES");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
