package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_09 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_09("SCOTT");
		System.out.println("이름\t\t부서번호\t동료");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.print(emp.getDno() + "\t");
			System.out.println(emp.getStringTemp());
		}
	}

}
