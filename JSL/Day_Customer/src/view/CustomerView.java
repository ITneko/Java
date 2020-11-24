package view;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.CustomerDAO;
import vo.Customer_VO;

public class CustomerView {
	Scanner sc = new Scanner(System.in);
	CustomerDAO DAO = CustomerDAO.getInstance();

	public void customerList() {
		List<Customer_VO> cList = DAO.customerList();
		if (cList.isEmpty()) {
			System.out.println("등록된 고객이 없습니다.");
		}
		System.out.println("\t*** 고객 전체 목록 ***");
		System.out.println("고객번호\t이름\t연락처\t직장명\t생년월일\t성별\t등록일자");
		for (Customer_VO cus : cList) {
			System.out.println(cus.getNum() + "\t" + cus.getName() + "\t" + cus.getTel() + "\t" + cus.getAddr() + "\t"
					+ cus.getOffice() + "\t" + cus.getBirthday() + "\t" + cus.getSex() + "\t" + cus.getIndate());
		}
	}

	public void customerInsert() {
		while (true) {
			System.out.println("\t*** 신규 고객 정보 등록 ***");
			System.out.println("메인으로 돌아가기 > END 입력");
			System.out.print("고 객 명 : ");
			String name = sc.next();
			if (name.toUpperCase().equals("END"))
				break;
			String tel = "";
			String telpattern = "\\d{3}-\\d{4}-\\d{4}";
			while (true) {
				System.out.print("연 락 처 : ");
				tel = sc.next();
				boolean bool = Pattern.matches(telpattern, tel);
				if (bool) {
					break;
				} else {
					System.out.println("잘못된 입력입니다!. xxx-xxxx-xxxx 형식으로 다시 입력해주세요.");
				}
			}
			System.out.print("주   소 : ");
			String addr = sc.next();
			sc.nextLine();
			System.out.print("직 장 명 : ");
			String office = sc.nextLine();
			if (office.equals("\r\n")) {
				office = null;
			}
			System.out.print("생년월일 : ");
			String birthday = sc.nextLine();
			if (birthday.equals("\r\n")) {
				birthday = null;
			}
			String sex = "";
			while (!sex.equals("M") && !sex.equals("F")) {
				System.out.print("성   별 : ");
				sex = sc.nextLine().toUpperCase();
			}
			System.out.print("등록하시겠습니다?(y/n)");
			if (sc.nextLine().contains("y")) {
				Customer_VO cusvo = new Customer_VO();
				cusvo.setName(name);
				cusvo.setTel(tel);
				cusvo.setAddr(addr);
				cusvo.setOffice(office);
				cusvo.setBirthday(birthday);
				cusvo.setSex(sex);
				int raw = DAO.customerInsert(cusvo);
				if (raw == 1) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}
			}

		}
	}

	public void customeSearch() {

		System.out.println("\t*** 고객 정보 검색 ***");

		System.out.print("원하는 고객의 이름을 입력하세요 >>");
		String name = sc.nextLine();
		Customer_VO cus = DAO.customerSearch(name);
		if (cus == null) {
			System.out.println("등록된 고객이 없습니다.");
		} else {
			System.out.println("고 객 명 : " + cus.getName());
			System.out.println("연 락 처 : " + cus.getTel());
			System.out.println("주   소 : " + cus.getAddr());
			System.out.println("직 장 명 : " + cus.getOffice());
			System.out.println("생년월일 : " + cus.getBirthday());
			System.out.println("성  별: " + cus.getSex());
			System.out.println("등록일자 : " + cus.getIndate());
		}
		System.out.println("메인 메뉴로 이동합니다(Enter) >>");
		sc.nextLine();

	}

	public void customerModify() {
		System.out.println("\t*** 고객 정보 수정 ***");
		System.out.print("수정을 원하는 고객의 번호를 입력하시오 >>");
		int x = sc.nextInt();
		String name = null;
		name = DAO.customerNumCheck(x);
		sc.nextLine();
		if(name != null) {
			System.out.println("고 객 명 : " + name);
			String tel = "";
			String telpattern = "\\d{3}-\\d{4}-\\d{4}";
			while (true) {
				System.out.print("연 락 처 : ");
				tel = sc.nextLine();
				boolean bool = Pattern.matches(telpattern, tel);
				if (bool) {
					break;
				} else {
					System.out.println("잘못된 입력입니다!. xxx-xxxx-xxxx 형식으로 다시 입력해주세요.");
				}
			}
			System.out.print("직 장 명 : ");
			String office = sc.nextLine();
			if (office.equals("\r\n")) {
				office = null;
			}
			System.out.println("수정하시겠습니까?(y/n)");
			if(sc.next().toUpperCase().contains("Y")) {
				int raw = DAO.customerModify(tel, office, x);
				if(raw==1) {
					System.out.println("수정이 완료되었습니다.");
				}
			}
			
		}else {
			System.out.println("해당 고객번호의 정보가 존재하지 않습니다.");
		}
	}

	public void customerDelete() {
		System.out.println("\t*** 고객 정보 수정 ***");
		System.out.print("삭제를 원하는 고객의 번호를 입력하시오 >>");
		int y = sc.nextInt();
		Customer_VO cus = DAO.customerList2(y);
		if(cus != null) {
			System.out.println("고 객 명 : " + cus.getName());
			System.out.println("연 락 처 : " + cus.getTel());
			System.out.println("주   소 : " + cus.getAddr());
			System.out.println("직 장 명 : " + cus.getOffice());
			System.out.println("생년월일 : " + cus.getBirthday());
			System.out.println("성  별: " + cus.getSex());
			System.out.println("등록일자 : " + cus.getIndate());
			
			System.out.println("\n삭제 하시겠습니까?(y/n)");
			if(sc.next().toUpperCase().contains("Y")) {
				int raw = DAO.customerDelete(y);
				if(raw == 1) {
					System.out.println("삭제 되었습니다.");
				}
			}
		}else {
			System.out.println("해당 고객번호의 정보가 존재하지 않습니다.");
		}
	}
}
