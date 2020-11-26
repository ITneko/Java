package view;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.EmployeeDAO;
import vo.Department_VO;
import vo.Emp_VO;

public class EmployeeView {
	Scanner sc = new Scanner(System.in);
	EmployeeDAO DAO = EmployeeDAO.getInstance();

	public void nullCheck(Object obj) {
		if (obj.equals(null) || obj.equals(0)) {
			System.out.print("\t");
		} else {
			System.out.print(obj + "\t");
		}
	}

	public void empIter(Emp_VO emp) {
		List list = new ArrayList();
		list.add(emp.getEno());
		list.add(emp.getEname());
		if (emp.getJob().length() < 8) {
			list.add(emp.getJob() + "\t");
		} else {
			list.add(emp.getJob());
		}
		list.add(emp.getManager());
		list.add(emp.getHiredate());
		list.add(emp.getSalary());
		list.add(emp.getCommission());
		list.add(emp.getDname());

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			nullCheck(obj);
		}
	}

	public void EmpList() {
		List<Emp_VO> cList = DAO.EmpList();
		if (cList.isEmpty()) {
			System.out.println("등록된 사원이 없습니다.");
		}
		System.out.println("\t*** 사원 전체 목록 ***");
		System.out.println("사원번호\t이름\t\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
		for (Emp_VO emp : cList) {
			empIter(emp);
			System.out.println();
		}
		System.out.println("메인 메뉴로 이동합니다(Enter)");
		while (!sc.nextLine().equals("")) {
		}
	}

	public void EmpInsert() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		String today = sdf.format(cal.getTime());

		System.out.println("\t*** 신규 사원 정보 등록 ***");
		System.out.println("메인으로 돌아가기 > END 입력");

		System.out.print("사원이름: ");
		String ename;
		while ((ename = sc.next().toUpperCase()) == null) {
		}
		System.out.print("업무명 : ");
		String job = sc.next().toUpperCase();
		System.out.print("상사번호 : ");
		int manager = sc.nextInt();
		sc.nextLine();
		System.out.print("입사일자(" + today + ") : ");
		String hiredate = sc.nextLine();
		if (hiredate.equals(""))
			hiredate = today;

		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("커미션 : ");
		int commission = sc.nextInt();
		System.out.print("부서정보(  ");
		List<Department_VO> list = DAO.DepartmentList();
		for (Department_VO dept : list) {
			System.out.print(dept.getDno() + ":" + dept.getDname() + "  ");
		}
		System.out.println(")");
		int dno=0;
		boolean bool = false;
		while (!bool) {
			System.out.print("부서번호 : ");
			dno = sc.nextInt();
			for (Department_VO dept : list) {
				if (dept.getDno() == dno) {
					bool = true;
					break;
				}
			}
		}
		sc.nextLine();
		System.out.print("등록하시겠습니다?(y/n)");
		if (sc.nextLine().contains("y")) {
			Emp_VO emp = new Emp_VO();
			emp.setEno(DAO.EmpNumCheck() + 1);
			emp.setEname(ename);
			emp.setJob(job);
			emp.setManager(manager);
			emp.setHiredate2(hiredate);
			emp.setSalary(salary);
			emp.setCommission(commission);
			emp.setDno(dno);
			int raw = DAO.EmpInsert(emp);
			if (raw == 1) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}
		}
	}

	public void EmpSearch() {
		while (true) {
			System.out.println("\t*** 사원 정보 검색 ***");
			System.out.print("검색할 사원이름을 입력하시오 >>");
			String ename = sc.next().toUpperCase();
			Emp_VO emp = DAO.EmpSearch(ename);
			if (emp != null) {
				System.out.println("사원번호 : " + emp.getEno());
				System.out.println("사원이름 : " + emp.getEname());
				System.out.println("업무명 : " + emp.getJob());
				System.out.println("상사이름 : " + emp.getManagername());
				System.out.println("입사일자 : " + emp.getHiredate());
				System.out.println("급여 : " + emp.getSalary());
				System.out.println("커미션 : " + emp.getCommission());
				System.out.println("부서명 : " + emp.getDname());
			} else {
				System.out.println("등록된 사원이 없습니다.");
			}
			System.out.print("검색을 계속하시겠습니까?(y/n) >>");
			String temp = "";
			while (!temp.equals("Y") && !temp.equals("N")) {
				temp = sc.next().toUpperCase();
			}
			if (temp.equals("N"))
				break;
		}
	}

	public void EmpModify() {
		while (true) {
			System.out.println("\t*** 사원 정보 검색 ***");
			System.out.print("검색할 사원번호을 입력하시오 >>");
			int eno = sc.nextInt();
			Emp_VO emp = DAO.EmpSearch2(eno);
			if (emp != null) {
				System.out.println("사원번호(" + emp.getEno() + ")");
				System.out.println("사원이름(" + emp.getEname() + ")");
				System.out.println("업무명(" + emp.getJob() + ")");
				System.out.println("상사번호(" + emp.getManager() + ")");
				System.out.println("입사일자(" + emp.getHiredate() + ")");
				System.out.println("급여(" + emp.getSalary() + ")");
				System.out.println("커미션(" + emp.getCommission() + ")");
				System.out.print("부서정보(  ");
				List<Department_VO> list = DAO.DepartmentList();
				for (Department_VO dept : list) {
					System.out.print(dept.getDno() + ":" + dept.getDname() + "  ");
				}
				System.out.println(")");
				System.out.println("부서번호(" + emp.getDno() + ")");
				System.out.print("수정하시겠습니까?(y/n) >>");
				String temp = "";
				while (!temp.equals("Y") && !temp.equals("N")) {
					temp = sc.next().toUpperCase();
				}
				if (temp.equals("Y")) {
					sc.nextLine();
					System.out.println("사원번호(" + emp.getEno() + ")");
					System.out.print("사원이름(" + emp.getEname() + ") : ");
					String ename;
					if (!(ename = sc.nextLine().toUpperCase()).equals("")) {
						emp.setEname(ename);
					}
					System.out.print("업무명(" + emp.getJob() + ") : ");
					String job;
					if (!(job = sc.nextLine().toUpperCase()).equals("")) {
						emp.setJob(job);
					}

					System.out.print("상사번호(" + emp.getManager() + ") : ");
					String manager;
					if (!(manager = sc.nextLine().toUpperCase()).equals("")) {
						emp.setManager(Integer.parseInt(manager));
					}

					System.out.print("입사일자(" + emp.getHiredate() + ") : ");
					String hiredate;
					if (!(hiredate = sc.nextLine().toUpperCase()).equals("")) {
						emp.setHiredate2(hiredate);
					}else {
						SimpleDateFormat transFormat = new SimpleDateFormat("yyyyMMdd");
						String str = transFormat.format(emp.getHiredate());
						emp.setHiredate2(str);
					}
					System.out.print("급여(" + emp.getSalary() + ") : ");
					String salary;
					if (!(salary = sc.nextLine()).equals("")) {
						emp.setSalary(Integer.parseInt(salary));
					}
					System.out.print("커미션(" + emp.getCommission() + "): ");
					String commission;
					if (!(commission = sc.nextLine()).equals("")) {
						emp.setCommission(Integer.parseInt(commission));
					}
					System.out.print("부서정보(  ");
					for (Department_VO dept : list) {
						System.out.print(dept.getDno() + ":" + dept.getDname() + "  ");
					}
					System.out.println(")");
					System.out.print("부서번호(" + emp.getDno() + ") : ");
					int dno;
					boolean bool = false;
					while (!bool) {
						dno = sc.nextInt();
						for (Department_VO dept : list) {
							if (dept.getDno() == dno) {
								bool = true;
								emp.setDno(dno);
								break;
							}
						}
					}
					sc.nextLine();
					System.out.println("수정은 y, 취소 후 메인으로 이동은 n");
					String temp2 = "";
					while (!temp2.equals("Y") && !temp2.equals("N")) {
						temp2 = sc.next().toUpperCase();
					}
					if(temp2.equals("Y")){
						int raw = DAO.EmpModify(emp);
						if(raw == 1) {
							System.out.println("수정성공");
							break;
						}else {
							System.out.println("수정실패");
						}
					}else if(temp2.equals("N")) break;
					
					
				} else if (temp.equals("N"))
					break;

			} else {
				System.out.println("등록된 사원이 없습니다.");
				break;
			}
			
		}
	}
	
	public void EmpDelete() {
		System.out.println("\t*** 사원 정보 삭제 ***");
		System.out.print("삭제할 사원번호를 입력하시오 >>");
		int eno = sc.nextInt();
		Emp_VO emp = DAO.EmpSearch2(eno);
		if (emp != null) {
			System.out.println("사원번호 : " + emp.getEno());
			System.out.println("사원이름 : " + emp.getEname());
			System.out.println("업무명 : " + emp.getJob());
			System.out.println("상사이름 : " + emp.getManagername());
			System.out.println("입사일자 : " + emp.getHiredate());
			System.out.println("급여 : " + emp.getSalary());
			System.out.println("커미션 : " + emp.getCommission());
			System.out.println("부서명 : " + emp.getDno());
			System.out.print("삭제 하시겠습니까?(y/n)");
			String temp = "";
			while (!temp.equals("Y") && !temp.equals("N")) {
				temp = sc.next().toUpperCase();
			}
			if(temp.equals("Y")){
				int raw = DAO.EmpDelete(eno);
				if(raw == 1) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제실패");
				}
			}
			
		} else {
			System.out.println("등록된 사원이 없습니다.");
		}
	}
}
