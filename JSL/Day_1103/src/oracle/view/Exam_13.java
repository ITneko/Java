package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_13 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();

		List<EmpVO> list = emp.exam_13("%A%","%E%");
		System.out.println("이름");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEname());
		}
	}
}
