package JavaM_Chapter04_Example;

/*
 * 공연은 하루에 한 번
 * 좌석은 S, A, B 각각 10개의 좌석
 * reservation, check, cancel, finish
 * 
 * 예약은 한 자리만 가능, 조회는 모든 좌석 출력(SAB)
 * 취소는 예약자 이름을 입력 받아 취소
 * 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다
*/

public class Ex12Seat {
	private String seat[][];
	private int num, seatNum;
	private String name;
	private boolean ok;
	private int count = 0;

	public Ex12Seat() {
		seat = new String[3][10];

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "---";
			}
		}
	}

	public void setNum(int num) {
		count = 0;
		if (num < 1 || num > 4) {
			System.out.println("입력 범위를 초과하였습니다!\n");
			this.ok = false;
			return;
		}

		this.num = num - 1;
		this.ok = true;
		count++;
	}

	public void setSeatNum(int seatNum) {
		if (seatNum < 1 || seatNum > 11) {
			System.out.println("입력 범위를 초과하였습니다!\n");
			this.ok = false;
			count = 0;
			return;
		}

		this.seatNum = seatNum - 1;
		this.ok = true;
		count++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountSeat() {
		if (count == 2) {
			setSeat();
			count = 0;
		}
	}

	private void setSeat() {
		ok = false;
		if (seat[num][seatNum] != "---") {
			System.out.println("해당 좌석은 이미 예약자가 존재합니다.\n");
			ok = false;
			return;
		}
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				ok = seat[i][j].equals(name);
				if (ok) {
					System.out.println(name + "님의 예약 좌석이 존재합니다.\n");
					ok = false;
					return;
				}
			}
		}
		seat[num][seatNum] = name;
		ok = true;
	}

	public boolean getOk() {
		return ok;
	}

	public String[][] getSeat() {
		return seat;
	}

	public void search(String name) {
		for (int i = 0; i < seat[num].length; i++) {
			ok = seat[num][i].equals(name);
			if (ok) {
				seat[num][i] = "---";
				return;
			}
		}
		if (!ok)
			count = 0;
	}

	public void showSeat(int num) {
		if (num == 1) {
			System.out.print("S>>");
			for (int i = 0; i < seat[0].length; i++)
				System.out.print(" " + seat[0][i]);
		} else if (num == 2) {
			System.out.print("A>>");
			for (int i = 0; i < seat[0].length; i++)
				System.out.print(" " + seat[1][i]);
		} else if (num == 3) {
			System.out.print("B>>");
			for (int i = 0; i < seat[0].length; i++)
				System.out.print(" " + seat[2][i]);
		}
		System.out.println("");

	}

	public void showSeatAll() {
		for (int i = 0; i < seat.length; i++) {
			if (i == 0)
				System.out.print("S>>");
			else if (i == 1)
				System.out.print("A>>");
			else if (i == 2)
				System.out.print("B>>");

			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(" " + seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>\n");
	}

}
