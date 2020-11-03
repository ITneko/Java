package oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import oracle.db.DBManager;
import oracle.vo.EmpVO;

public class EmpSQL {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	// 덧셈 연산자를 이용하여 모든 사원에 대해 $300의 급여 인상을 계산한 후 사원의 이름,급여,인상된 급여를 출력
	public List<EmpVO> exam_01(int x) {
		String query = "select ename, salary, salary+? as salary2 from employee";
		List<EmpVO> eList = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
//				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
//				emp.setJob(rs.getString("job"));
//				emp.setManager(rs.getInt("manager"));
//				emp.setHiredate(rs.getDate("Hiredate"));
				emp.setSalary(rs.getInt("Salary"));
//				emp.setCommission(rs.getInt("commission"));
//				emp.setDno(rs.getInt("dno"));
				emp.setIntTemp(rs.getInt("salary2"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return eList;
	}

	// 사원의 이름, 급여, 연간 총수입을 총 수입이 많은 것부터 작은 순으로 출력하시오. 연간 총수입은 월급에 12를 곱한 후 $100의
	// 상여금을 더해서 계산
	public List<EmpVO> exam_02(int x) {
		String query = "select ename, salary, salary*12+? as salary2 from employee order by salary2 desc";
		List<EmpVO> eList = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
//				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
//				emp.setJob(rs.getString("job"));
//				emp.setManager(rs.getInt("manager"));
//				emp.setHiredate(rs.getString("Hiredate"));
				emp.setSalary(rs.getInt("Salary"));
//				emp.setCommission(rs.getInt("commission"));
//				emp.setDno(rs.getInt("dno"));
				emp.setIntTemp(rs.getInt("salary2"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return eList;
	}

	// 급여가 2000을 넘는 사원의 이름과 급여를 급여가 많은 것부터 작은 순으로 출력
	public List<EmpVO> exam_03(int x) {
		String query = "select ename, salary from employee where salary>? order by salary desc";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 사원번호가7788인 사원의 이름과 부서번호 출력
	public List<EmpVO> exam_04(int x) {
		String query = "select ename, dno from employee where eno=?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setDno(rs.getInt("dno"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 급여가 2000에서 3000사이에 포함되지 않는 사원의 이름과 급여 출력
	public List<EmpVO> exam_05(int x, int y) {
		String query = "select ename, salary from employee where salary not between ? AND ?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			pstmt.setInt(2, y);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 1981년 2월 20일부터 1981년 5월 1일 사이에 입사한 사원의 이름, 담당 업무, 입사일 출력
	public List<EmpVO> exam_06(String x, String y) {
		String query = "select ename, job, hiredate from employee where hiredate between ? and ?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x);
			pstmt.setString(2, y);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getDate("hiredate"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 부서 번호가 20 및 30에 속한 사원의 이름과 부서번호를 출력하되 이름을 기준(내림차순)으로 영문자순으로 출력
	public List<EmpVO> exam_07(int x, int y) {
		String query = "select ename, dno from employee where dno in(?,?) order by ename";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			pstmt.setInt(2, y);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setDno(rs.getInt("dno"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 사원의 급여가 2000에서 3000사이에 포함되고 부서번호가 20또는 30인 사원의 이름, 급여와 부서번호를 출력하되 이름
	// 순(오름차순)으로 출력
	public List<EmpVO> exam_08(int x, int y, int i, int z) {
		String query = "select ename, salary, dno from employee where salary "
				+ "between ? and ? and dno in(?,?) order by ename";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			pstmt.setInt(2, y);
			pstmt.setInt(3, i);
			pstmt.setInt(4, z);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDno(rs.getInt("dno"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 1981년도에 입사한 사원의 이름과 입사일을 출력(like연산자와 와일드카드 사용)
	public List<EmpVO> exam_09(String x) {
		String query = "select ename, hiredate from employee where hiredate like ?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getDate("hiredate"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 관리자가 없는 사원의 이름과 담당 업무를 출력
	public List<EmpVO> exam_10(String x) {
		String query = "select ename, job from employee where manager is " + x;
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));

				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 커미션을 받을 수 있는 자격이 되는 사원의 이름, 급여, 커미션을 출력하되 급여 및 커미션을 기준으로 내림차순 정렬
	public List<EmpVO> exam_11(String x) {
		String query = "select ename, salary, commission from employee where "
				+ "commission is " + x + " order by salary, commission";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 이름의 세 번째 문자가 R인 사원의 이름을 표시
	public List<EmpVO> exam_12(String x) {
		String query = "select ename from employee where ename like ?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 이름에 A와 E를 모두 포함하고 있는 사원의 이름을 표시
	public List<EmpVO> exam_13(String x, String y) {
		String query = "select ename from employee where ename like ? and ename like ?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x);
			pstmt.setString(2, y);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}

	// 담당업무가 사무원(CLERK) 또는 영업사원(SALESMAN)이면서 급여가 $1600, $950 또는 $1300이 아닌 사원의 이름, 담당
	// 업무, 급여를 출력
	public List<EmpVO> exam_14(String x, String y, int a, int b, int c) {
		String query = "select ename, job, salary from employee where job in(?,?) and salary not in(?,?,?)";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x);
			pstmt.setString(2, y);
			pstmt.setInt(3, a);
			pstmt.setInt(4, b);
			pstmt.setInt(5, c);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}
	// 커미션이 $500 이상인 사원의 이름과 급여 및 커미션을 출력
	public List<EmpVO> exam_15(int x) {
		String query = "select ename, salary, commission from employee where commission>=?";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, x);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				eList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}
}
