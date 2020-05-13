package JavaM_Chapter04_Example;

import java.util.Scanner;

/*
 * 공연은 하루에 한 번
 * 좌석은 S, A, B 각각 10개의 좌석
 * reservation, search, cancel, finish
 * 
 * 예약은 한 자리만 가능, 조회는 모든 좌석 출력(SAB)
 * 취소는 예약자 이름을 입력 받아 취소
 * 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다
*/

public class Ex12System {
	private Ex12Seat s1 = new Ex12Seat();
	private int num;
	Scanner sc = new Scanner(System.in);

	public void reservation() {

		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		num = sc.nextInt();
		s1.setNum(num);
		if (!s1.getOk())
			return;

		s1.showSeat(num);

		System.out.print("이름>>");
		s1.setName(sc.next());
		if (!s1.getOk())
			return;

		System.out.print("좌석번호>>");
		num = sc.nextInt();
		s1.setSeatNum(num);
		if (!s1.getOk())
			return;

		s1.setCountSeat();
		if (!s1.getOk())
			return;

		System.out.println("예약이 완료됐습니다.\n");

	}

	public void search() {
		s1.showSeatAll();
	}

	public void cancel() {
		System.out.print("좌석 S(1), A(2), B(3)>>");
		num = sc.nextInt();
		s1.setNum(num);
		if (!s1.getOk())
			return;

		s1.showSeat(num);

		System.out.print("이름>>");
		s1.search(sc.next());
		if (s1.getOk()) 
			System.out.println("<<<예약이 취소됐습니다.>>>\n");
		else
			System.out.println("입력하신 이름은 등록되지 않은 예약자입니다!\n");
		
		
	}

	public void finish() {
		System.exit(0);
	}

	public void run() {
		System.out.println("명품콘선트홀 예약 시스템입니다.");

		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				reservation();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				finish();
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
