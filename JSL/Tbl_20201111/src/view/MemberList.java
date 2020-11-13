package view;
/*	회원번호	회원성명	연락처			성별	가입일자			고객등급	도시코드
 * 	100001	김행복	010-111-1111	남	2015년12월02일	VIP		서울
 * 
 * 	고객등급 A -> VIP, B -> 일반, C -> 직원
 */

import java.util.List;

import dao.Tbl_DAO;
import vo.Member_VO;

public class MemberList {
	public static void main(String[] args) {
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		List<Member_VO> list = DAO.memberList();
		System.out.println("회원번호\t회원성명\t연락처\t\t성별\t가입일자\t\t고객등급\t도시코드");
		for (Member_VO member : list) {
			System.out.print(member.getCustno() + "\t");
			System.out.print(member.getCustname() + "\t");
			System.out.print(member.getPhone() + "\t");
			System.out.print(member.getGender() + "\t");
//			String gender = "";
//			switch(member.getGender()) {
//			case "M":
//					gender="남"; break;
//			case "F":
//					gender="여"; break;
//			}
//			System.out.print(gender + "\t");
			
			System.out.print(member.getJoindate() + "\t");
//			switch (member.getGrade()) {
//			case "A":
//				grade = "VIP";
//				break;
//			case "B":
//				grade = "일반";
//				break;
//			case "C":
//				grade = "직원";
//				break;
//			}
			System.out.print(member.getGrade() + "\t");

			System.out.println(member.getStringTemp() + "\t");
		}
	}
}
