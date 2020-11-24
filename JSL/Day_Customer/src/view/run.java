package view;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerView cus = new CustomerView();
		while (true) {
			System.out.println("=================================");
			System.out.println("=\t고객관리 프로그램 Ver 1.0\t=");
			System.out.println("=================================");
			System.out.println("\t[1] 고객 전체 목록");
			System.out.println("\t[2] 신규 고객 등록");
			System.out.println("\t[3] 고객 검색");
			System.out.println("\t[4] 고객 정보 수정");
			System.out.println("\t[5] 고객 정보 삭제");
			System.out.println("\t[6] 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.print("해당항목을 선택하시오. >>");
			int x = sc.nextInt();
			System.out.println("=================================");
			switch (x) {
			case 1:
				cus.customerList();
				break;

			case 2:
				cus.customerInsert();
				break;

			case 3:
				cus.customeSearch();
				break;

			case 4:
				cus.customerModify();
				break;

			case 5:
				cus.customerDelete();
				break;

			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
