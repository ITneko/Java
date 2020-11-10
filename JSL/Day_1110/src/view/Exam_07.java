package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_07 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		
		int row = DAO.exam_07(7369);
		if(row>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
