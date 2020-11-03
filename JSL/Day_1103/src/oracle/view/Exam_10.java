package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_10 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		List<EmpVO> list = emp.exam_10("null");
		System.out.println("이름\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.println(list.get(i).getSalary());
		}
	}
}
