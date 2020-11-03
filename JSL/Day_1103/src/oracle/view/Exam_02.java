package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		List<EmpVO> list = emp.exam_02(100);
		System.out.println("이름\t급여\t연간 총 수입");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.println(list.get(i).getIntTemp());
		}
	}

}
