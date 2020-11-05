package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_06 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();

		List<EmpDTO> emp = DAO.exam_06(2000);
		for (EmpDTO list : emp) {
			System.out.print(list.getJob() + "\t");
			System.out.println(list.getIntTemp());
		}
	}
}
