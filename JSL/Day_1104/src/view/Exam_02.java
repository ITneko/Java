package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		List<EmpVO> list = DAO.exam_02(4);
		System.out.println("사원번호\t사원이름\t담당업무\t매니저\t입사일\t\t급여\t상여급\t부서번호");
		System.out.println(list.get(0));
	}

}
