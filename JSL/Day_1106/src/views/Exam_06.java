package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_06 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_06("NEW YORK");
		System.out.println("사원이름\t담당업무\t\t부서번호\t부서명");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.print(emp.getJob() + "\t");
			System.out.print(emp.getDno() + "\t");
			System.out.println(emp.getDname());
		}
	}

}