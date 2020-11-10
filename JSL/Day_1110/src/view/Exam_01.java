package view;

import dao.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO manager = EmpDAO.getInstance();
		manager.exam_01();
	}

}
