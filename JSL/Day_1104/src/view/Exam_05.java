package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		List<EmpVO> list = DAO.exam_05("2020/01/01", "YYYY/MM/DD");
		System.out.println("올해 며칠이 지났는가");
		System.out.println(list.get(0).getStringTemp());
	}

}
