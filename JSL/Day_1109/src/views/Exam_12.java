package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_12 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_12("DALLAS");
		
		for(EmpDTO emp : list) {
			System.out.println(emp.getEname() +"\t"+ emp.getDno() +"\t"+ emp.getJob());
		}
	}

}
