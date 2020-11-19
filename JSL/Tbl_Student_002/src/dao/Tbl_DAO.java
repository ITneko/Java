package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utr.DBUtil;
import vo.Score_VO;
import vo.Student_VO;

public class Tbl_DAO {
	private Tbl_DAO() {}
	private static Tbl_DAO instance = new Tbl_DAO();
	public static Tbl_DAO getInstance() {
		return instance;
	}
	
	public int studnetInsert(Student_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Student_VO student = null;
		int raw= 0;
		String sql = "";
		if(!x.getRegdate().equals("SYSDATE")) {
			sql = "insert into tbl_student_002 values(?,?,?,?,?,?,?,?)";
		}else {
			sql = "insert into tbl_student_002 values(?,?,?,?,?,?,?,SYSDATE)";
		}
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			student = x;
			pstmt.setString(1, student.getHakbun());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPhone1());
			pstmt.setString(4, student.getPhone2());
			pstmt.setString(5, student.getPhone3());
			pstmt.setString(6, student.getBirth());
			pstmt.setString(7, student.getGender());
			if(!x.getRegdate().equals("SYSDATE")) 
				pstmt.setString(8, student.getRegdate());
			raw = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return raw;
	}
	
	public int scoreInsert(Score_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Score_VO score = null;
		int raw= 0;
		String sql = "";
			sql = "insert into tbl_score_002 values(?,?,?,?)";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			score = x;
			pstmt.setString(1, x.getHakbun());
			pstmt.setInt(2, x.getKor());
			pstmt.setInt(3, x.getEng());
			pstmt.setInt(4, x.getMat());
			
			raw = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return raw;
	}
}
