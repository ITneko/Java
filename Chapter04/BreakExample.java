package Chapter04;

// break [label];
public class BreakExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("For문 실행이 종료되었습니다.");
	}

}
