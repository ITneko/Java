package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		List<EmpVO> list = DAO.exam_04("YY/MON/DD DY");
		System.out.println("입사일\t\t입사일(세부)");
		for (EmpVO emp : list) {
			System.out.println(emp.getHiredate() + "\t" + emp.getStringTemp());
		}
	}

}
