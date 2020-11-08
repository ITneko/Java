package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_10 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_10("WARD");
		System.out.println("ENAME\t\tHIREDATE");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.println(emp.getHiredate());
		}
	}

}
