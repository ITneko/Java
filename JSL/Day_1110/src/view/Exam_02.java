package view;

import dao.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		// 키보드로 입력
		int bno = 1234;
		String name = "김학생";
		String job = "SALEMAN";
		int manager = 7698;
	
		int row = DAO.exam_02(bno, name, job, manager);
		if(row>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
