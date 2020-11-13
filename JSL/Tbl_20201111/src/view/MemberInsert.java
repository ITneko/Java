package view;

import java.util.*;

import dao.Tbl_DAO;
import vo.Member_VO;

public class MemberInsert {

	public static void main(String[] args)  {
		Member_VO member = null;
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		int count = DAO.cityCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원번호(정수 6자리 이내), 회원성명, 연락처, 성별(M,F), 가입일자, 고객등급(A~C), 도시코드(01~"+count+")");
		int row = 0;
		
		while (true) {
			member = new Member_VO();
			int custno = Integer.parseInt(sc.next().trim());
			if(custno == 0) break;
			member.setCustno(custno);
			member.setCustname(sc.next().trim());
			member.setPhone(sc.next().trim());
			member.setGender(sc.next().trim());
			member.setJoindate(sc.next().trim());
			member.setGrade(sc.next().trim());
			member.setCity(sc.next().trim());

			row = DAO.insertMember(member);
			if(row==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
		}
		
		

	}
}
