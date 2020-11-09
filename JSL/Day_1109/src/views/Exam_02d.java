package views;

import mapper.EmpDAO;

public class Exam_02d {

	public static void main(String[] args) {
		EmpDAO manager = EmpDAO.instance;
		manager.CreateExam_02();
	}

}
