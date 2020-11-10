package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_10 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		int row = DAO.exam_10(10,40);
		if(row>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}

}
