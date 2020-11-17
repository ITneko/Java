package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utr.DBUtil;
import vo.Dept_VO;
import vo.Person_VO;

public class Tbl_DAO {
	private Tbl_DAO() {};
	private static Tbl_DAO instance = new Tbl_DAO();
	public static Tbl_DAO getInstance() {
		return instance;
	}
	
	public int sawonInsert(Person_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Person_VO person = null;
		String sql = "insert into tbl_person_201116 values(?, ?, ?, ?,?,?,?)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			person = x;
			pstmt.setInt(1, person.getSawon());
			pstmt.setString(2, person.getName());
			pstmt.setString(3, person.getDuty());
			pstmt.setString(4, person.getPhone());
			pstmt.setString(5, person.getIndate());
			pstmt.setString(6, person.getOutdate());
			pstmt.setString(7, person.getDcode());
			row = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	public int deptInsert(Dept_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_dept_201116 values(?, ?, ?)";
		int row = 0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	public int sawonSeq() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int seq = 0;
		String sql = "select tbl_person_seq_sawon.nextval from dual";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			seq = rs.getInt(1);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return seq;
	}
	
	public int sawonCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select max(sawon) from tbl_person_201116";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			count = rs.getInt(1);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	
	public Person_VO sawonSearch(int sawon) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Person_VO person = null;
		String sql = "select name, duty, phone, indate, dname from tbl_person_201116 a, tbl_dept_201116 b where a.dcode=b.dcode and sawon=?";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sawon);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				person = new Person_VO();
				person.setName(rs.getNString(1));
				person.setDuty(rs.getString(2));
				person.setPhone(rs.getString(3));
				person.setIndate(rs.getString(4));
				person.setStringTemp(rs.getString(5));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return person;
	}
	
	public List<Dept_VO> dept_SawonList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept_VO> eList = new ArrayList<Dept_VO>();
		Dept_VO dept = null;
		String sql = "select b.dcode, dname, inwon, count(a.dcode) inw from tbl_person_201116 a, tbl_dept_201116 b where a.dcode=b.dcode group by b.dcode,dname,inwon,a.dcode order by inw desc";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dept = new Dept_VO();
				dept.setDcode(rs.getString(1));
				dept.setDname(rs.getString(2));
				dept.setInwon(rs.getInt(3));
				dept.setIntTemp(rs.getInt(4));
				eList.add(dept);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eList;
	}
}
