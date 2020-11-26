package view;

import java.util.Scanner;

import model.EmployeeDAO;

public class run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeView emp = new EmployeeView();
		while (true) {
			System.out.println("=================================");
			System.out.println("=\t사원&부서관리 프로그램 Ver 1.0=");
			System.out.println("=================================");
			System.out.println("\t[1] 사원 전체 목록");
			System.out.println("\t[2] 신규 사원 등록");
			System.out.println("\t[3] 사원 검색");
			System.out.println("\t[4] 사원 정보 수정");
			System.out.println("\t[5] 사원 정보 삭제");
			System.out.println("\t[6] 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.print("해당항목을 선택하시오. >>");
			int x = sc.nextInt();
			System.out.println("=================================");
			switch (x) {
			case 1:
				emp.EmpList();
				break;

			case 2:
				emp.EmpInsert();
				break;

			case 3:
				emp.EmpSearch();
				break;

			case 4:
				emp.EmpModify();
				break;

			case 5:
				emp.EmpDelete();
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
