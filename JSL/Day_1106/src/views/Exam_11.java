package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_11 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_11();
		System.out.println("ENAME\t\tHIREDATE\tENAME\tHIREDATE");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.print(emp.getHiredate() + "\t");
			System.out.print(emp.getStringTemp() + "\t");
			System.out.println(emp.getDateTemp());
		}
	}

}
