package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.Emp_VO;
import vo.Department_VO;

public class EmployeeDAO {
	private EmployeeDAO() {
	}

	private static EmployeeDAO instance = new EmployeeDAO();

	public static EmployeeDAO getInstance() {
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jslhrd46", "1234");
		} catch (Exception e) {
			System.out.println("db 연결 실패");
		}
		return conn;
	}

	public List<Emp_VO> EmpList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Emp_VO> cList = new ArrayList<Emp_VO>();
		Emp_VO emp = null;
		ResultSet rs = null;
		String sql = "select eno, ename, job, manager, hiredate, salary, commission, dname from employee e, department d where e.dno=d.dno";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Emp_VO();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getNString(2));
				emp.setJob(rs.getNString(3));
				emp.setManager(rs.getInt(4));
				emp.setHiredate(rs.getDate(5));
				emp.setSalary(rs.getInt(6));
				emp.setCommission(rs.getInt(7));
				emp.setDname(rs.getNString(8));
				
				cList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cList;
	}
	
	public int EmpNumCheck() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Emp_VO emp = null;
		ResultSet rs = null;
		String sql = "select max(eno) from employee";
		int num = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				num = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return num;
	}
	
	public int EmpInsert(Emp_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Emp_VO emp = x;
		String sql = "insert into employee values(?,?,?,?,to_date(?,'yyyy-mm-dd'),?,?,?)";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getManager());
			pstmt.setString(5, emp.getHiredate2());
			pstmt.setInt(6, emp.getSalary());
			pstmt.setInt(7, emp.getCommission());
			pstmt.setInt(8, emp.getDno());
			raw = pstmt.executeUpdate();
			
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return raw;
	}
	
	public List<Department_VO> DepartmentList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Department_VO> list = new ArrayList<Department_VO>();
		Department_VO dept = null;
		ResultSet rs = null;
		String sql = "select dno, dname from department";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dept = new Department_VO();
				dept.setDno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				list.add(dept);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public Emp_VO EmpSearch(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Emp_VO emp = null;
		ResultSet rs = null;
		String sql = "select eno, ename, job, manager, hiredate, salary, commission, dname, manager  from employee e, department d where e.dno=d.dno and ename=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Emp_VO();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setManager(rs.getInt(4));
				emp.setManagername(ManagerNmaeSearch(emp.getManager()));
				emp.setHiredate(rs.getDate(5));
				emp.setSalary(rs.getInt(6));
				emp.setCommission(rs.getInt(7));
				emp.setDname(rs.getString(8));
				emp.setManager(rs.getInt(9));
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return emp;
	}
	
	public String ManagerNmaeSearch(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String managername = null;
		ResultSet rs = null;
		String sql = "select ename from employee where eno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				managername = rs.getString(1);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return managername;
	}
	
	public Emp_VO EmpSearch2(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Emp_VO emp = null;
		ResultSet rs = null;
		String sql = "select * from employee where eno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Emp_VO();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setManager(rs.getInt(4));
				emp.setManagername(ManagerNmaeSearch(emp.getManager()));
				emp.setHiredate(rs.getDate(5));
				emp.setSalary(rs.getInt(6));
				emp.setCommission(rs.getInt(7));
				emp.setDno(rs.getInt(8));
			}				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return emp;
	}

	public int EmpModify(Emp_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Emp_VO emp = x;
		String sql = "update employee set ename=?, job=?, manager=?, hiredate=?, salary=?, commission=?, dno=? where eno=?";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEname());
			pstmt.setString(2, emp.getJob());
			pstmt.setInt(3, emp.getManager());
			pstmt.setString(4, emp.getHiredate2());
			pstmt.setInt(5, emp.getSalary());
			pstmt.setInt(6, emp.getCommission());
			pstmt.setInt(7, emp.getDno());
			pstmt.setInt(8, emp.getEno());
			raw = pstmt.executeUpdate();
			
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return raw;
	}
	
	public int EmpDelete(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from employee where eno=?";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			raw = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return raw;
	}
}
