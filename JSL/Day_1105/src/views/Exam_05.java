package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();

		EmpDTO emp = DAO.exam_05();

		System.out.println(emp.getIntTemp());

	}

}
