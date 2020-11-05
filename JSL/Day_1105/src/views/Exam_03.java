package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		
		List<EmpDTO> emp = DAO.exam_03();
		for (EmpDTO list : emp) {
			System.out.print(list.getJob() + "\t");
			System.out.println(list.getIntTemp());
		}
	}

}
