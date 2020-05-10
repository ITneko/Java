package JavaM_Chapter04_Example;

/*
 * input()
 * view()
 * finish()
 * run() > 1
*/
import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class Ex07MonthSchedule {
	private int num;
	private int day;
	private String str;
	private Day day2[];
	private Scanner sc = new Scanner(System.in);

	public Ex07MonthSchedule(int day) {
		this.day = day;
		day2 = new Day[this.day];
		for (int i = 0; i < day2.length; i++) {
			day2[i] = new Day();
		}
	}

	public void view() {
		System.out.print("날짜(1~30) >> ");
		num = sc.nextInt();
		System.out.printf("%d일의 할일은 ", num);
		day2[num - 1].show();
		System.out.println();
	}

	public void input() {
		System.out.print("날짜(1~30) >> ");
		num = sc.nextInt();
		System.out.print("할일(빈칸없이입력) >> ");
		str = sc.next();
		day2[num - 1].set(str);
		System.out.println();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public void run() {
		System.out.println("=======이번달 스케쥴 관리 프로그램=======");

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");

			switch (num = sc.nextInt()) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
			default:
				System.out.println("다시 입력해주세요");
			}

		}

	}
}