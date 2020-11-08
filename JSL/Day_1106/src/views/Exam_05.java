package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_05("A");
		System.out.println("사원이름\t부서이름");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.println(emp.getDname());
		}
	}

}
