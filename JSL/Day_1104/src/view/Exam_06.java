package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_06 {

	public static void main(String[] args) {
		
		EmpDAO DAO = EmpDAO.getInstance();
		List<EmpVO> list = DAO.exam_06(0);
		System.out.println("서원번호\t사원이름\t상관사번");
		for(EmpVO emp : list) {
			System.out.println(emp.getEno() + "\t" + emp.getEname()+ "\t" + emp.getManager());
		}

	}

}
