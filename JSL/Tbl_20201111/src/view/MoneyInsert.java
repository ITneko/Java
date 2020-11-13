package view;
/*	입력형식
 * 	회원번호: 100009
 *  등록된 회원이 아닙니다.
 *  
 *  판매번호 : 
 *  .	.
 *  
 *  판매일자 :
 * 
 * 	회원번호가 "end" 전체 출력 하고 종료
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Tbl_DAO;
import vo.Member_VO;
import vo.Money_VO;

public class MoneyInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		Money_VO money = null;
		System.out.println("회원번호, 판매번호, 단가, 수량, 가격, 상품코드, 판매일자");
		while (true) {
			String custnos = sc.next().trim();
			if (custnos.toUpperCase().equals("END"))
				break;
			int custno = Integer.parseInt(custnos.trim());
			int row = DAO.custnoCheack(custno);
			if(row == 0) {
				System.out.println("등록된 회원이 아닙니다.");
				System.out.println("다시 입력해주시길 바랍니다.\n");
				continue;
			}
			
			int saleno = sc.nextInt();
			int pcost = sc.nextInt();
			int amount = sc.nextInt();
			int price = sc.nextInt();
			String pcode = sc.next().trim();
			String sdate = sc.next().trim();

			money = new Money_VO();
			money.setCustno(custno);
			money.setSaleno(saleno);
			money.setPcost(pcost);
			money.setAmount(amount);
			money.setPrice(price);
			money.setPcode(pcode);
			money.setSdate(sdate);

			row = DAO.insertMoney(money);
			if(row==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
		}

	}

}

