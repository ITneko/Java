package view;
/*	회원별 매출 현황 출력
 * 	[출력 형식]
 * 	회원번호	회원성명	전화	고객등급	매출액	
 *  100001	김행복		VIP		8,000
 * 
 */

import java.util.List;

import dao.Tbl_DAO;
import vo.Member_VO;

public class MemberSaleList {

	public static void main(String[] args) {
		Tbl_DAO manager = Tbl_DAO.getInstance();
		List<Member_VO> list = manager.memberSaleList();
		System.out.println("회원번호\t회원성명\t전화\t\t고객등급\t매출액");
		for(Member_VO mem : list) {
			System.out.print(mem.getCustno()+"\t");
			System.out.print(mem.getCustname()+"\t");
			System.out.print(mem.getPhone()+"\t");
			System.out.print(mem.getGrade()+"\t");
			System.out.println(mem.getIntTemp()+"\t");
			
		}
	}

}
