package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();

		List<EmpVO> list = emp.exam_04(7788);
		System.out.println("이름\t부서번호");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.println(list.get(i).getDno());
		}
	}

}
