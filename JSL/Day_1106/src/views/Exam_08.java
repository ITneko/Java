package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_08 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_08();
		System.out.println("Employee\tEmp#\tManager\tMgr#");
		for(EmpDTO emp : list) {
			System.out.print(emp.getEname() +"\t");
			System.out.print(emp.getManager() + "\t");
			System.out.print(emp.getIntTemp() + "\t");
			System.out.println(emp.getStringTemp());
		}
	}

}
