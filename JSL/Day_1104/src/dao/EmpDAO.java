package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

import db.DBUtil;
import vo.EmpVO;

public class EmpDAO {
	private EmpDAO() {
	}

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO getInstance() {
		return instance;

	}

	// 메소드 정의
	public List<EmpVO> exam_01() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 1. 리턴용 변수 또는 객체 생성
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		// 2. 쿼리문 장성
		String sql = "select substr(hiredate,1,2) year, substr(hiredate,4,2) month from employee";

		// 리턴용 변수 또는 객체정의
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
//			pstmt.executeUpadate(); // 그외에.
			rs = pstmt.executeQuery(); // select를 사용했을때
			while (rs.next()) {
				emp = new EmpVO();
				emp.setStringTemp(rs.getString("year"));
				emp.setStringTemp2(rs.getString("month"));

				eList.add(emp);
			}
		} catch (Exception e) {

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

	public List<EmpVO> exam_02(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		String sql = "select * from employee where substr(hiredate,4,2)=?";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();

				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setManager(rs.getInt("manager"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				emp.setDno(rs.getInt("dno"));

				eList.add(emp);
			}

		} catch (Exception e) {

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

	// MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
	public List<EmpVO> exam_03(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from employee where MOD(eno,?)=0";

		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();

				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setManager(rs.getInt("manager"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
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

	public List<EmpVO> exam_04(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select hiredate, to_char(hiredate, ?) as days from employee";

		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, x);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();

				emp.setHiredate(rs.getDate("hiredate"));
				emp.setStringTemp(rs.getString("days"));

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

	public List<EmpVO> exam_05(String x, String y) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select TRUNC(SYSDATE - TO_DATE(?, ?)) as date2 from dual";

		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, y);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp = new EmpVO();

				emp.setStringTemp(rs.getString("date2"));
				;

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

	public List<EmpVO> exam_06(int x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select eno, ename, nvl2(manager,manager,?) as manager from employee";
		
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpVO();
				
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setManager(rs.getInt("manager"));
				
				eList.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpVO> exam_07(List x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select eno, ename, job, salary, DECODE(JOB, ?, salary+?, ?, salary+?,?, salary+?,?, salary+?, salary) as update_salary from employee";
		List<EmpVO> eList = new ArrayList<EmpVO>();
		EmpVO emp = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			int cnt=0;
			for(int i=1; i<=8; i++) {
				String str = (String)x.get(cnt);
				String str2[] = str.split(",");
				pstmt.setString(i++, str2[0]);
				pstmt.setInt(i, Integer.parseInt(str2[1]));
				cnt++;
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpVO();
				
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				emp.setIntTemp(rs.getInt("update_salary"));
				eList.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
}
