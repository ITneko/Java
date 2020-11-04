package view;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_07 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.getInstance();
		List<String> lists = new ArrayList<String>();
		lists.add("analyst,200");
		lists.add("salesman,180");
		lists.add("manager,150");
		lists.add("clerk,100");
		
		List<EmpVO> list = DAO.exam_07(lists);
		for(EmpVO emp : list) {
			System.out.println(emp.getEno() + "\t" + emp.getEname()+ "\t" + emp.getJob()+ "\t" +emp.getIntTemp());
		}
		
	}
}
