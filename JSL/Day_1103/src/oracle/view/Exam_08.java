package oracle.view;

import java.util.List;

import oracle.dao.EmpSQL;
import oracle.vo.EmpVO;

public class Exam_08 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();

		List<EmpVO> list = emp.exam_08(2000,3000,20,30);
		System.out.println("이름\t급여\t부서번호");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.println(list.get(i).getDno());
		}
	}
}
