package JavaM_Chapter06_Example;

import java.util.Calendar;
import java.util.Scanner;

class GameUser {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int sec1, sec2, sec3, absec;
	private Calendar time;
	
	public GameUser() {

	}

	public GameUser(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSec1() {
		return sec1;
	}

	public void setSec1(int sec1) {
		this.sec1 = sec1;
	}

	public int getSec2() {
		return sec2;
	}

	public void setSec2(int sec2) {
		this.sec2 = sec2;
	}

	public int getSec3() {
		return sec3;
	}

	public void setSec3(int sec3) {
		this.sec3 = sec3;
	}

	public int getAbsec() {
		return absec;
	}

	public void setAbsec(int absec) {
		this.absec = absec;
	}

	public String toString() {
		return getName() + "의 결과 " + getSec3();
	}

	public void game() {
		System.out.print("\n참가자의 이름을 입력해주세요>>");
		setName(sc.next());
		sc.nextLine();

		System.out.print(getName() + "시작 <Enter>키>>");
		setSec1(setTime());

		System.out.print("10초 예상 후 <Enter>키>>");
		setSec2(setTime());

		autoSetSec3();
		autoSetAbsec();
	}

	public int setTime() {
		sc.nextLine();
		time = Calendar.getInstance();
		int temp = time.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + temp);
		return temp;
	}

	private void autoSetSec3() {
		if (sec1 <= sec2)
			setSec3(sec2 - sec1);
		else
			setSec3((sec2 + 60) - sec1);
	}

	private void autoSetAbsec() {
		setAbsec(Math.abs(sec3 - 10));
	}

	public boolean ifAbs(GameUser user) {
		if (this.absec <= user.absec)
			return true;
		return false;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("참가자의 수를 입력해주세요>> ");
		int users = sc.nextInt();
		GameUser[] user = new GameUser[users];

		System.out.println("\n총 참가자의 수는 " + users + "명입니다!");
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

		for (int i = 0; i < user.length; i++) {
			user[i] = new GameUser();
			user[i].game();
		}

		for (Object obj : user) {
			System.out.print(obj.toString() + ", ");
		}

		GameUser winner = user[0];

		for (int i = 0; i < user.length; i++) {
			if (!winner.ifAbs(user[i])) {
				winner = user[i];
			}
		}
		System.out.print("승자는 " + winner.getName());

		
	}
}