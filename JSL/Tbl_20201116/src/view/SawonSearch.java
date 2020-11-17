package view;

import java.util.Scanner;

import dao.Tbl_DAO;
import vo.Person_VO;

/*	문제1. : 사원번호를 이용한 검색 프로그램 작성
 * 	입력형식
 *	사원번호 : 1002
 *	사원이름 : 홍길동
 *	직책 : 과장
 *	연락처 : 010-3333-4444
 *	입사일자 : 2018년10월23일
 * 	부서명 : 고객지원부
 *
 *	사원번호 : 1010
 *	등록된 사원이 없습니다.
 *
 *	사원번호 : 0000 -> 프로그램 종료
 */
public class SawonSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("사원번호 : ");
			int sawon = sc.nextInt();
			if (sawon == 0000)break;
			Tbl_DAO manager = Tbl_DAO.getInstance();
			Person_VO person = manager.sawonSearch(sawon);
			if(person == null) {
				System.out.println("등록된 사원이없습니다.\n");
				continue;
			}
			
			System.out.println("사원이름 : "+person.getName());
			System.out.println("직책 : "+person.getDuty());
			System.out.println("연락처 : "+person.getPhone());
			String str = person.getIndate();
			System.out.println("입사일자 : "+str.substring(0, 4) + "년" + str.substring(5, 7) + "월" + str.substring(8, 10) + "일");
			System.out.println("부서명 : " +person.getStringTemp()+"\n");
		}
	}

}
