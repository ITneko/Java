package view;

import java.util.List;

import dao.Tbl_DAO;
import vo.Dept_VO;

/*	문제 2. 부서별 사원 현황 출력
 * 	[출력형식]
 * 			*** 부서별 사원 현황 ***
 * 		부서코드	부서명	부서정원	부서인원
 * 			02	고객지원부		10		3
 * 			03	생산관리부		5		2
 * 			01	경영지원부		5		2
 * 			04	영업관리부		8		1
 * 
 * 	- 현 부서인원이 많은 순서부터 출력
 */
public class Dept_Sawon {

	public static void main(String[] args) {
		Tbl_DAO manager = Tbl_DAO.getInstance();
		List<Dept_VO> list = null;
		System.out.println("부서코드\t부서명\t부서정원\t부서인원");
		list = manager.dept_SawonList();
		for (Dept_VO dept : list) {
			System.out.print(dept.getDcode() + "\t");
			System.out.print(dept.getDname() + "\t");
			System.out.print(dept.getInwon() + "\t");
			System.out.println(dept.getIntTemp());
		}
	}

}
