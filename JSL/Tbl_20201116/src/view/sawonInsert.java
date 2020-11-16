package view;

import java.util.Scanner;

import dao.Tbl_DAO;
import vo.Person_VO;

public class sawonInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tbl_DAO manager = Tbl_DAO.getInstance();
		Person_VO person = null;
		while(true) {
			int sawon = manager.sawonCount()+1;
			System.out.println("사원번호 : " + sawon);
			System.out.print("사원명 : ");
			String name = sc.next().trim();
			if(name.toUpperCase().equals("END")) break;
			System.out.print("직책 : ");
			String duty = sc.next().trim();
			System.out.print("연락처 : ");
			String phone = sc.next().trim();
			System.out.print("입사일자 : ");
			String indate = sc.next().trim();
			System.out.print("퇴사일자 : ");
			String outdate = sc.next().trim();
			if(outdate.equals("null"))
				outdate = null;
			System.out.print("부서코드 : ");
			String dcode = sc.next().trim();
			
			person = new Person_VO();
			person.setSawon(sawon);
			person.setName(name);
			person.setDuty(duty);
			person.setPhone(phone);
			person.setIndate(indate);
			person.setOutdate(outdate);
			person.setDcode(dcode);
			
			int row = manager.sawonInsert(person);
			if(row == 1) {
				System.out.println("등록 성공!");
			}else {
				System.out.println("등록 실패!");
			}
		}
	}

}
