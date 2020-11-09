package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_15 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_15("M");
		
		for(EmpDTO emp : list) {
			System.out.println(emp.getEno() + "\t"+ emp.getEname() +"\t"+ emp.getSalary());
		}
	}

}
