package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_14 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();

		List<EmpVO> list = emp.exam_14("CLERK", "SALESMAN", 1600, 950, 1300);
		System.out.println("이름\t담당업무\t\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getJob() + "\t");
			System.out.println(list.get(i).getSalary() + "\t");

		}
	}
}
