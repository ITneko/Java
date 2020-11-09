package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_10 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_10();
		
		for(EmpDTO emp : list) {
			System.out.println(emp.getEno() +"\t"+ emp.getEname());
		}
	}

}
