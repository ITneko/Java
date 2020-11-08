package mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.EmpDTO;
import util.DBUtil;

public class EmpDAO {
	private EmpDAO () {}
	public static EmpDAO instance = new EmpDAO();
	
	public EmpDAO getInstance() {
		return instance;
	}
	
	public List<EmpDTO> exam_01(String x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select e.ename, e.dno, d.dname from employee e, department d where e.dno=d.dno and e.ename=?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString("ename"));
				emp.setDno(rs.getInt("dno"));
				emp.setDname(rs.getString("dname"));
				
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_02(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select ename, dname, loc from employee e join department d on e.dno=d.dno";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString("ename"));
				emp.setDname(rs.getString("dname"));
				emp.setLoc(rs.getString("loc"));
				
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_03(int x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select dno, job, loc from employee inner join department using(dno) where dno=?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setDno(rs.getInt("dno"));
				emp.setJob(rs.getString("job"));
				emp.setLoc(rs.getString("loc"));
				
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}

	public List<EmpDTO> exam_04(int x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select ename, dname, loc from employee natural join department where commission>?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString("ename"));
				emp.setDname(rs.getString("dname"));
				emp.setLoc(rs.getString("loc"));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}

	
	public List<EmpDTO> exam_05(String x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select e.ename, d.dname from employee e, department d where e.dno=d.dno and e.ename like ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+x+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString("ename"));
				emp.setDname(rs.getString("dname"));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_06(String x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select ename, job, dno, dname from employee natural join department where loc=?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setDno(rs.getInt("dno"));
				emp.setDname(rs.getString("dname"));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_07(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select emp.ename as Employee, emp.manager as Emp#, mgr.eno as Manager, mgr.ename as Mgr# from employee emp, employee mgr where emp.manager=mgr.eno";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString(1));
				emp.setManager(rs.getInt(2));
				emp.setIntTemp(rs.getInt(3));
				emp.setStringTemp(rs.getNString(4));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_08(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select emp.ename as Employee, emp.manager as Emp#, mgr.eno as Manager, mgr.ename as Mgr# from employee emp, employee mgr where emp.manager=mgr.eno(+) order by emp.eno desc";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString(1));
				emp.setManager(rs.getInt(2));
				emp.setIntTemp(rs.getInt(3));
				emp.setStringTemp(rs.getNString(4));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_09(String x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select me.ename as 이름, me.dno as 	부서번호, other.ename as 동료 from employee me, employee other where me.dno=other.dno and me.ename=? and other.ename!=?";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getNString(1));
				emp.setDno(rs.getInt(2));
				emp.setStringTemp(rs.getNString(3));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_10(String x){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select other.ename, other.hiredate from employee ward, employee other where other.hiredate>ward.hiredate and ward.ename=? order by hiredate";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getString(1));
				emp.setHiredate(rs.getDate(2));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
	
	public List<EmpDTO> exam_11(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> eList = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String sql = "select other.ename, other.hiredate, mgr.ename, mgr.hiredate from employee mgr, employee other where other.manager=mgr.eno and other.hiredate<=mgr.hiredate";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpDTO();
				emp.setEname(rs.getString(1));
				emp.setHiredate(rs.getDate(2));
				emp.setStringTemp(rs.getString(3));
				emp.setDateTemp(rs.getDate(4));
				eList.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return eList;
	}
}
