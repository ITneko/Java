package views;

import mapper.EmpDAO;

public class Exam_08d {

	public static void main(String[] args) {
		EmpDAO manager = EmpDAO.instance;
		manager.CreateExam_08("loc");
	}

}
