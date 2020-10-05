import java.util.Scanner;
/*	입력예시
 * 	수치입력(1 ~ ?) : 6 (예시)
 *	입력예시(100번 발생)
 * 	1:***(3)
 * 	2:*****(5)
 * 	3:
 * 	4:
 * 	5:
 * 	6:******(10)
 *	최대 : 6(18)
 *	최소 : 3(2)
 * 
 */

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randValue;

		System.out.print("수치입력: ");
		int value = sc.nextInt();
		int saveCnt[] = new int[value];

		System.out.print("횟수: ");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			randValue = (int) (Math.random() * value) + 1;
			saveCnt[randValue - 1] += 1;
		}

		int max = saveCnt[0];
		int min = saveCnt[0];
		int maxi = 0;
		int mini = value - 1;

		for (int i = 0; i < value; i++) {
			if (max < saveCnt[i]) {
				max = saveCnt[i];
				maxi = i;
			}
			if (min > saveCnt[i]) {
				min = saveCnt[i];
				mini = i;
			}

			System.out.print(i + 1 + ":");
			for (int y = 0; y < saveCnt[i]; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < value; i++) {

		}

		System.out.println("최대 : " + (maxi + 1) + "(" + max + ")");
		System.out.println("최소 : " + (mini + 1) + "(" + min + ")");
	}

}
