package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_09 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();

		List<EmpDTO> emp = DAO.exam_09();
		for (EmpDTO list : emp) {
			System.out.print(list.getJob()+"\t");
			System.out.print(list.getDno()+"\t");
			System.out.print(list.getIntTemp()+"\t");
			System.out.print(list.getIntTemp2()+"\t");
			System.out.print(list.getIntTemp3()+"\t");
			System.out.println(list.getIntTemp4());
		}
	}
}
