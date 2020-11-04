package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		List<EmpVO> list = DAO.exam_01();
		System.out.println("년도\t달");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getStringTemp()+"\t");
			System.out.println(list.get(i).getStringTemp2());
		}
	}

}
