package views;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		
		EmpDTO emp = DAO.exam_01();
		System.out.println("MAX :" + emp.getIntTemp());
		System.out.println("MIN :" + emp.getIntTemp2());
		System.out.println("SUM :" + emp.getIntTemp3());
		System.out.println("AVG :" + emp.getDoubleTemp4());
	}

}
