package views;

import mapper.EmpDAO;

public class Exam_01d {

	public static void main(String[] args) {
		EmpDAO manager = EmpDAO.instance;
		manager.createExam();
	}

}
