package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_02();
		System.out.println("사원이름\t부서이름\t\t지역");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.print(emp.getDname() +"\t");
			System.out.println(emp.getLoc());
		}
	}

}
