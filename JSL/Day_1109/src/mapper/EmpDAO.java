package mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.EmpDTO;
import util.DBUtil;

public class EmpDAO {
	private EmpDAO() {
	};

	public static EmpDAO instance = new EmpDAO();

	// Create 테이블 생성
	public void createExam() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "create table dept (" + "dno number(2)," + "dname varchar2(14)," + "loc varchar2(13))";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void CreateExam_02() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "create table emp(" + "eno number(4)," + "ename varchar2(10)," + "dno number(2))";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void CreateExam_03() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "alter table emp modify ename varchar2(25)";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void CreateExam_04() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "create table employee2(emp_id, name, sal, dept_id) as select eno, ename, salary, dno from employee";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void CreateExam_05() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "drop table emp";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void CreateExam_06() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "rename employee2 to emp";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void CreateExam_07() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "alter table dept drop column dname";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void CreateExam_08(String x) {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "alter table dept set unused("+x+")";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void CreateExam_09() {
		Connection conn = null;
		// PreparedStatement pstmt = null;
		Statement stmt = null;

		String sql = "alter table dept drop unused columns";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<EmpDTO> exam_01(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, job from employee where job = (select job from employee where eno=?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getString(1));
				emp.setJob(rs.getString(2));

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

	public List<EmpDTO> exam_02(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, job from employee where salary > (select salary from employee where eno=?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getString(1));
				emp.setJob(rs.getString(2));

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

	public List<EmpDTO> exam_03() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, job, salary from employee where salary = (select min(salary) from employee)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getString(1));
				emp.setJob(rs.getString(2));
				emp.setSalary(rs.getInt(3));

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

	public List<EmpDTO> exam_04() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select job, round(avg(salary),1) from employee group by job having round(avg(salary),1) = (select min(round(avg(salary),1)) from employee group by job)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setJob(rs.getString(1));
				emp.setIntTemp(rs.getInt(2));

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
	
	public List<EmpDTO> exam_05() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, salary, dno from employee where salary in(select min(salary) from employee group by dno)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(1));
				emp.setSalary(rs.getInt(2));
				emp.setDno(rs.getInt(3));
				
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
	
	public List<EmpDTO> exam_06(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select eno, ename, job, salary from employee where salary < any (select salary from employee where job=?) and job<> ?";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				emp.setJob(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				
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
	
	public List<EmpDTO> exam_07() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename from employee where eno in(select eno from employee where manager is null)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(1));
				
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
	
	public List<EmpDTO> exam_08() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename from employee where eno in(select eno from employee where manager is not null)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(2));
				
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
	
	public List<EmpDTO> exam_09(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, hiredate from employee where dno in(select dno from employee where ename=?) and ename<>?";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(1));
				emp.setHiredate(rs.getDate(2));
				
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
	
	public List<EmpDTO> exam_10() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select eno, ename from employee where salary > (select round(avg(salary),1) from employee) order by salary asc";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				
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
	
	public List<EmpDTO> exam_11(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select eno, ename from employee where dno in (select dno from employee where ename like ?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+x+"%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				
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
	
	public List<EmpDTO> exam_12(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, dno, job from employee where dno = (select dno from department where loc=?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(1));
				emp.setDno(rs.getInt(2));
				emp.setJob(rs.getString(3));
				
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
	
	public List<EmpDTO> exam_13(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename, salary from employee where manager = (select eno from employee where ename=?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEname(rs.getNString(1));
				emp.setSalary(rs.getInt(2));
				
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
	
	public List<EmpDTO> exam_14(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select eno, ename, job from employee where dno = (select dno from department where dname=?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				emp.setJob(rs.getString(3));
				
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
	
	public List<EmpDTO> exam_15(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select eno, ename, salary from employee where salary > (select round(avg(salary),1) from employee) and dno in(select dno from employee where ename like ?)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+x+"%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();

				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				emp.setSalary(rs.getInt(3));
				
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
	
	public List<EmpDTO> exam_16() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select job,avg(salary) from employee group by job having avg(salary) = (select min(avg(salary)) from employee group by job)";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				
				emp.setJob(rs.getString(1));
				emp.setSalary(rs.getInt(2));
				
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
	
	public List<EmpDTO> exam_17(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;

		String sql = "select ename from employee where dno in(select dno from employee where job=?) and job<>?";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				
				emp.setEname(rs.getString(1));
				
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
