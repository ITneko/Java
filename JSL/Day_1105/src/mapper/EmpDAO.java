package mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.EmpDTO;
import util.DBUtil;

public class EmpDAO {
	private EmpDAO() {
	}

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO getInstance() {
		return instance;
	}

	// 문제 1
	public EmpDTO exam_01() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select max(salary) as Maximum, min(salary) as Minimum, sum(salary) as Sum, round(avg(salary),2) as Average from employee";
		EmpDTO emp = new EmpDTO();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp.setIntTemp(rs.getInt(1));
				emp.setIntTemp2(rs.getInt(2));
				emp.setIntTemp3(rs.getInt(3));
				emp.setDoubleTemp4(rs.getDouble(4));
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

			}
		}
		return emp;
	}

	public List<EmpDTO> exam_02() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT JOB, MAX(SALARY) as max , MIN(SALARY) as min , SUM(SALARY) as sum, ROUND(AVG(SALARY)) as avg FROM EMPLOYEE GROUP BY JOB";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setJob(rs.getString("job"));
				emp.setIntTemp(rs.getInt(2));
				emp.setIntTemp2(rs.getInt(3));
				emp.setIntTemp3(rs.getInt(4));
				emp.setIntTemp4(rs.getInt(5));

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

			}
		}
		return eList;
	}

	public List<EmpDTO> exam_03() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, count(*) from employee group by job";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setJob(rs.getString("job"));
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

			}
		}
		return eList;
	}

	public EmpDTO exam_04() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select count(manager) from employee";
		EmpDTO emp = null;
		// List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setIntTemp(rs.getInt(1));

//				eList.add(emp);
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

			}
		}
		return emp;
	}

	public EmpDTO exam_05() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select max(salary)-min(salary) from employee";
		EmpDTO emp = null;
		// List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setIntTemp(rs.getInt(1));

//				eList.add(emp);
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

			}
		}
		return emp;
	}

	public List<EmpDTO> exam_06(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, min(salary) from employee group by job having not min(salary)<? order by min(salary) desc";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setJob(rs.getString("job"));
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

			}
		}
		return eList;
	}

	public List<EmpDTO> exam_07() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select dno, count(*), avg(salary) from employee group by dno";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setDno(rs.getInt(1));
				emp.setIntTemp(rs.getInt(2));
				emp.setDoubleTemp4(rs.getDouble(3));

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

			}
		}
		return eList;
	}
	
	
	public List<EmpDTO> exam_08() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select decode(dno, 10, 'accounting', 20, 'research', 30,'sales', 40, 'operations'), decode(dno, 10, 'new york', 20, 'dallas', 30, 'chicago' ,40, 'boston'), count(*), round(avg(salary)) from employee group by dno";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setStringTemp(rs.getString(1));
				emp.setStringTemp2(rs.getString(2));
				emp.setIntTemp(rs.getInt(3));
				emp.setDoubleTemp4(rs.getDouble(4));
				
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

			}
		}
		return eList;
	}
	
	public List<EmpDTO> exam_09() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, dno, decode(dno,10,sum(salary)),decode(dno,20,sum(salary)),decode(dno,30,sum(salary)),sum(salary) from employee group by job,dno order by dno";
		EmpDTO emp = null;
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setJob(rs.getString(1));
				emp.setDno(rs.getInt(2));
				emp.setIntTemp(rs.getInt(3));
				emp.setIntTemp2(rs.getInt(4));
				emp.setIntTemp3(rs.getInt(5));
				emp.setIntTemp4(rs.getInt(6));
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

			}
		}
		return eList;
	}

}
