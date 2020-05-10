package JavaM_Chapter04_Example;

import java.util.Scanner;

class Ex08Phone {
	private String name;
	private String tel;
	
	public Ex08Phone() {
		
	}
	
	public Ex08Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void getDetails() {
		System.out.println(name + "의 번호는 " + tel + " 입니다.");
	}
	
}


public class Ex08PhoneBook {
	Scanner sc = new Scanner(System.in);

	private int num;
	private String name, tel;
	private Ex08Phone Person[];
	private boolean ok = false;

	public Ex08PhoneBook() {

	}

	public void search() {
		while (true) {
			System.out.print("검색할 이름>> ");
			name = sc.next();

			if (name.equals("그만"))
				break;

			for (int i = 0; i < Person.length; i++) {
				ok = Person[i].getName().equals(name);
				if (ok) {
					Person[i].getDetails();
					break;
				}
			}
			if (ok != true)
				System.out.println(name + " 에대한 정보가 없습니다.");
		}
	}

	public void input() {
		System.out.print("인원수>> ");
		num = sc.nextInt();

		Person = new Ex08Phone[num];

		for (int i = 0; i < Person.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			name = sc.next();
			tel = sc.next();
			Person[i] = new Ex08Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}

	public void run() {
		input();
		search();
		System.out.println("프로그램이 종료됐습니다.");
	}

}