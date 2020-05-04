package JavaM_Chapter03_Example;

//숨겨진 카드의 수 맞추기 게임
import java.util.Scanner;

public class OpenChallengeEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int randValue = 0;
		int num, count = 1;
		char yn = ' ';

		while (true) {
			if (count == 1) {
				randValue = (int) (Math.random() * 100);
				System.out.println("수를 결정하였습니다. 맞추어 보세요!\n0-99");
			}

			System.out.printf("%d>>", count);
			num = sc.nextInt();
			count++;

			if (num == randValue) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				yn = sc.next().charAt(0);

				if (yn == 'y' || yn == 'Y') {
					count = 1;
					continue;
				} else if (yn == 'n' || yn == 'N') {
					System.out.println("프로그램이 종료됐습니다.");
					break;
				} 
			} else if (num > randValue)
				System.out.println("더 낮게");
			else
				System.out.println("더 높게");
		}

	}

}
