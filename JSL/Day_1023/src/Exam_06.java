import java.util.Scanner;

@FunctionalInterface
interface MySum {
	public int add(int x, int y);
}

public class Exam_06 {

	public static void main(String[] args) {
		// 키보드로 x,y를 입력 받아서
		// x~y의 소수의 개수를 리턴하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		MySum sum;
		System.out.print("x,y입력: ");
		int start = sc.nextInt();
		int end = sc.nextInt();

		sum = (x, y) -> {
			int pn = 0;
			for (int t = x; t <= y; t++) {
				int count = 0;
				for (int z = 2; z <= t; z++) {
					if (t % z == 0)
						count++;
				}
				if (count == 1) {
					pn++;
				}
			}
			return pn;
		};

		System.out.println(sum.add(start, end));
	}

}
