package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_07 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();

		List<EmpDTO> emp = DAO.exam_07();
		for (EmpDTO list : emp) {
			System.out.print(list.getDno()+"\t");
			System.out.print(list.getIntTemp() +"\t");
			System.out.println(list.getDoubleTemp4());
		}
	}
}
