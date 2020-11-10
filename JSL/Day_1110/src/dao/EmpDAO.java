package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBUtil;
import vo.EmpVO;

public class EmpDAO {
	private EmpDAO() {
	};

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO getInstance() {
		return instance;
	}

	public void exam_01() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "create table emp_insert as select * from employee where 0=1";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}

	public int exam_02(int bno, String name, String job, int manager) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into emp_insert(eno, ename, job, manager, hiredate) values(?,?,?,?,sysdate)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, name);
			pstmt.setString(3, job);
			pstmt.setInt(4, manager);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public int exam_02_1(EmpVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into emp_insert(eno, ename, job, manager, hiredate) values(?,?,?,?,sysdate)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getManager());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public int exam_03(EmpVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into emp_insert values(?,?,?,?, to_date(sysdate-1, 'YY/MM/DD'), ?, ?, ?)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getManager());
			pstmt.setInt(5, vo.getSalary());
			pstmt.setInt(6, vo.getCommission());
			pstmt.setInt(7, vo.getDno());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public void exam_04() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "create table emp_copy as select * from employee";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}
	
	public int exam_05(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update emp_copy set dno=10 where eno=?";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public int exam_06(int x, int y) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update emp_copy set (job,salary) = (select job, salary from emp_copy where eno=?) where eno=?";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			pstmt.setInt(2, y);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public int exam_07(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update emp_copy set dno = (select dno from emp_copy where eno=?) where job = (select job from emp_copy where eno=?)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			pstmt.setInt(2, x);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public void exam_08() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "create table dept_copy as select * from department";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}
	
	public int exam_09(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "delete from dept_copy where dname=?";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
	public int exam_10(int x, int y) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "delete from dept_copy where dno in(?,?)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			pstmt.setInt(2, y);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
}
