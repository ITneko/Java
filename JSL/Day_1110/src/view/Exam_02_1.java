package view;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_02_1 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		// 키보드로 입력
		int bno = 4321;
		String name = "박학생";
		String job = "SALEMAN";
		int manager = 7698;

		EmpVO vo = new EmpVO();
		vo.setEno(bno);
		vo.setEname(name);
		vo.setJob(job);
		vo.setManager(manager);
		int row = DAO.exam_02_1(vo);
		if (row > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
