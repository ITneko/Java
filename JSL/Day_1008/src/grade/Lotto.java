package grade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto {

	public static void sort(int val[], int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int y = i + 1; y < cnt; y++) {
				if (val[i] > val[y]) {
					int temp = val[i];
					val[i] = val[y];
					val[y] = temp;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// 랜덤값 설정
		Scanner sc = new Scanner(System.in);
		int randValue[] = new int[7];
		for (int i = 0; i < randValue.length; i++) {
			randValue[i] = (int) (Math.random() * 40) + 6;
			for (int y = 0; y < i; y++) {
				if (randValue[i] == randValue[y]) {
					i--;
					break;
				}
			}
		}
		// 랜덤값 정렬
		sort(randValue, randValue.length - 1);

		// 게임 수, 번호선택
		int roundGame = 0;

		while (roundGame < 1) {
			try {
				System.out.print("게임 수 입력: ");
				roundGame = sc.nextInt();
				if (roundGame < 1) {
					throw new NegativeArraySizeException();
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값이 입력되었습니다!");
			} catch (NegativeArraySizeException e) {
				System.out.println("1 이상의 값을 입력해주세요!");
			} finally {
				sc.nextLine();
			}
		}

		int cnt = 0;
		int val[][] = new int[roundGame][6];
		while (roundGame > cnt) {
			System.out.print((cnt + 1) + " : ");
			String s[] = sc.next().split(",");
			if (s.length != 6) {
				System.out.println("6개까지 선택가능!");
				continue;
			}
			for (int i = 0; i < 6; i++) {
				val[cnt][i] = Integer.parseInt(s[i]);
				if (val[cnt][i] < 1 || val[cnt][i] > 45) {
					System.out.println("입력 범위 초과!");
					cnt--;
					break;
				}
			}
			cnt++;
		}

		// 선택된 번호 정렬
		for (int i = 0; i < val.length; i++) {
			sort(val[i], val[i].length);
		}

		System.out.println("==============================");
		System.out.println("당첨결과");
		System.out.print("당첨범호 : ");
		for (int i = 0; i < randValue.length; i++) {
			System.out.print(randValue[i] + "\t");
		}
		System.out.println();

		int oxcnt[] = new int[7];

		for (int i = 0; i < val.length; i++) {
			int sum = 0;
			System.out.print((i + 1) + " : ");
			for (int y = 0; y < val[i].length; y++) {
				System.out.print(val[i][y]);
				if (y < val[i].length - 1) {
					System.out.print(",");
				}
				for (int x = 0; x < val[i].length + 1; x++) {
					if (val[i][y] == randValue[x]) {
						sum += ++oxcnt[x];
					}
				}
			}
			if (oxcnt[oxcnt.length - 1] == 1 && sum < 6) {
				sum--;
			}

			switch (sum) {
			case 6:
				if (oxcnt[oxcnt.length - 1] == 0) {
					System.out.println(" --1등");
				} else {
					System.out.println(" --2등");
				}
				break;
			case 5:
				System.out.println(" --3등");
				break;
			case 4:
				System.out.println(" --4등");
				break;
			case 3:
				System.out.println(" --5등");
				break;
			default:
				System.out.println(" --꽝");
			}

			for (int x = 0; x < oxcnt.length; x++) {
				oxcnt[x] = 0;
			}
		}
	}
}
