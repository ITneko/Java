package oopSecond;

import java.util.Scanner;

public class CustomerManager {

	static final int MAX = 100;

	static Customer[] cusList = new Customer[MAX];

	
	static int count;

	static Scanner scan = new Scanner(System.in);
	
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();

		Customer c1 = new Customer(name, gender, email, birthYear);
		cusList[count] = c1;
		count++;
	}
	
	public static Customer selectCustomerData() {
		while(true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력해 주세요.");
			String name = scan.next();
			for(int i=0; i<count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i];
				}
			}
			System.out.println("입력하신 이름을 가진 데이터가 없습니다.");
		}
	}

	public static void printCustomerData(Customer cus) {
		System.out.println(cus.toString());
	}

	public static void updateCustomerData(Customer cus) {
		System.out.println("-----------UPDATE CUSTOMER INFO-----------");
		System.out.print("이름(" + cus.getName() + ") :");
		cus.setName(scan.next());

		System.out.print("성별(" + cus.getGender() + ") :");
		cus.setGender(scan.next()); 

		System.out.print("이메일(" + cus.getEmail() + ") :");
		cus.setEmail(scan.next());

		System.out.print("출생년도(" + cus.getBirthYear() + ") :");
		cus.setBirthYear(scan.nextInt());
	}
	
	public static void deleteCustomerData(Customer cus) {
		for(int i=0; i<count; i++) {
			if(cusList[i].getName().equals(cus.getName())) {
				for(int j=i; j<count-1; j++) {
					cusList[j] = cusList[j+1];
				}
			}
		}
		System.out.println("데이터가 삭제되었습니다.");
		count--;
	}

	public static void main(String[] args) {

		while (true) {
			System.out.printf("\n[INFO] 고객 수  : %d\n", count);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)elect, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch (menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				insertCustomerData();
				System.out.println("고객정보를 저장했습니다.");
				break;
			case 's':
				System.out.println("데이터를 출력합니다.");
				if ((count > 0)) {
					printCustomerData(selectCustomerData());
				} else {
					System.out.println("출력할 데이터가 없습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if ((count > 0)) {
					updateCustomerData(selectCustomerData());
				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deleteCustomerData(selectCustomerData());
				} else {
					System.out.println("삭제할 데이터가 없습니다..");
				}
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}
		}
	}

}
