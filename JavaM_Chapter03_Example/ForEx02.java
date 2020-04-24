package JavaM_Chapter03_Example;

/*
1.전체의 합
2.홀수의 합
3.짝수의 합
4.종료
를 하는 프로그램을 만드시오 단 입력받은 숫자 까지의 합임
 */
import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, sum = 0;

		while (true) {
			System.out.print("입력된 값 까지의 합을 구합니다. 정수를 입력하시오>>");
			i = sc.nextInt();

			System.out.println("(1)전체의 합, (2)홀수의 합, (3)짝수의 합, (4)종료");
			j = sc.nextInt();

			switch (j) {
			case 1:
				for (int a = 0; a <= i; a++)
					sum += a;
				break;

			case 2:
				for (int a = 0; a <= i; a++) {
					if (a % 2 == 0)
						continue;
					sum += a;
				}
				break;

			case 3:
				for (int a = 0; a <= i; a++) {
					if (a % 2 != 0)
						continue;
					sum += a;
				}
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (j == 4)
				break;
			System.out.printf("값 : %d\n\n\n",sum);
			sum = 0;
		}

	}
}
