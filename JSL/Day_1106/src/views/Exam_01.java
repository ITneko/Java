package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.instance;
		List<EmpDTO> list = DAO.exam_01("SCOTT");
		System.out.println("사원이름\t사원번호\t부서이름");
		System.out.println(list.get(0).getEname() +"\t" + list.get(0).getDno() + "\t" + list.get(0).getDname());
	}

}
