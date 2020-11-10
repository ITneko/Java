package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		
		DAO.exam_04();
	}

}
