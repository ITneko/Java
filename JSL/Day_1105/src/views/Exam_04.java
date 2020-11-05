package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();

		EmpDTO emp = DAO.exam_04();

		System.out.println(emp.getIntTemp());
		
	}

}
