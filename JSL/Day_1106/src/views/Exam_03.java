package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_03(10);
		System.out.println("부서번호\t담당업무\t\t지역");
		for(EmpDTO emp : list) {
			System.out.print(emp.getDno() +"\t");
			System.out.print(emp.getJob() +"\t");
			System.out.println(emp.getLoc());
		}
	}

}
