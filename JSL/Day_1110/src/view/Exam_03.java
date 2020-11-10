package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		// 키보드로 입력
		int eno = 2;
		String ename = "LEEJH";
		String job = "SOLDIER";
		int salary = 1150;
		int dno = 20;
	
		EmpVO vo = new EmpVO();
		vo.setEno(eno);
		vo.setEname(ename);
		vo.setJob(job);
		vo.setSalary(salary);
		vo.setDno(dno);
		int row = DAO.exam_03(vo);
		if(row>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
