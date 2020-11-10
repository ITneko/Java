package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		
		int row = DAO.exam_05(7788);
		if(row>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
