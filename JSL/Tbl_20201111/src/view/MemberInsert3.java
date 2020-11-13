package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Tbl_DAO;
import vo.Member_VO;

/*	회원등록
 * 	회원번호 : 100007		//자동입력(마지막 번호+1)
 * 	회원성명 : 
 * 
 */
public class MemberInsert3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member_VO mem = null;
		Tbl_DAO manager = Tbl_DAO.getInstance();
		int count = manager.cityCount();
		System.out.println("회원성명, 연락처, 성별(M,F), 가입일자, 고객등급(A~C), 도시코드(01~" + count + ")");
		int row = 0;
		while (true) {
			int custno = manager.custnoSeq();
			mem = new Member_VO();
			System.out.println("회원번호 : " + custno);
			System.out.print("회원성명 : ");
			String custname = sc.next().trim();
			if(custname.toUpperCase().equals("END"))
				break;
			System.out.print("연락처 : ");
			String phone = sc.next().trim();
			String gender = " ";
			while (!gender.equals("M") && !gender.equals("F")) {
				System.out.print("성별(M/F) : ");
				gender = sc.next().trim().toUpperCase();
			}
			System.out.print("가입일자 : ");
			String joindate = sc.next().trim();
			System.out.print("고객등급(A~C) : ");
			String grade = sc.next().trim().toUpperCase();
			System.out.print("도시코드(01~" + count + ") :");
			String city = sc.next().trim();

			mem.setCustno(custno);
			mem.setCustname(custname);
			mem.setPhone(phone);
			mem.setGender(gender);
			mem.setJoindate(joindate);
			mem.setJoindate(joindate);
			mem.setGrade(grade);
			mem.setCity(city);

			row = manager.insertMember(mem);
			if (row == 1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		}
		
		
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		List<Member_VO> list = DAO.memberList();
		System.out.println("회원번호\t회원성명\t연락처\t\t성별\t가입일자\t\t고객등급\t도시코드");
		for (Member_VO member : list) {
			System.out.print(member.getCustno() + "\t");
			System.out.print(member.getCustname() + "\t");
			System.out.print(member.getPhone() + "\t");
			
			String gender = "";
			switch(member.getGender()) {
			case "M":
					gender="남"; break;
			case "F":
					gender="여"; break;
			}
			System.out.print(gender + "\t");
			
			System.out.print(member.getJoindate() + "\t");
			String grade = "";
			switch (member.getGrade()) {
			case "A":
				grade = "VIP";
				break;
			case "B":
				grade = "일반";
				break;
			case "C":
				grade = "직원";
				break;
			}
			System.out.print(grade + "\t");

			System.out.println(member.getStringTemp() + "\t");
		}
	}

}
