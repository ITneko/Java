package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utr.DBUtil;
import view.RsList;
import vo.Score_VO;
import vo.Student_VO;

public class Tbl_DAO {
	private static final int List = 0;
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
		String sql = "insert into tbl_score_002 values(?,?,?,?)";
		
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
	
	public int hakbunCheck(String x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Score_VO score = null;
		ResultSet rs = null;
		int raw= 0;
		String sql = "select hakbun from tbl_student_002 where hakbun=?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(x));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				raw = rs.getInt(1);
			}
			
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
	
	public RsList scoreList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Student_VO> sList = new ArrayList<Student_VO>();
		List<Score_VO> cList = new ArrayList<Score_VO>();
		Student_VO student = null;
		Score_VO score = null;
		ResultSet rs = null;
		String sql = "select a.hakbun, name, case when gender='M' then '남' when gender='F' then '여' end as gender, kor, eng, mat, sum(kor+eng+mat) sum, round(((kor+eng+mat)/3),2) avg from tbl_student_002 a, tbl_score_002 b where a.hakbun=b.hakbun group by a.hakbun, name,gender, kor, eng, mat";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				student = new Student_VO();
				score = new Score_VO();
				student.setHakbun(rs.getString(1));
				student.setName(rs.getString(2));
				student.setGender(rs.getString(3));
				
				score.setKor(rs.getInt(4));
				score.setEng(rs.getInt(5));
				score.setMat(rs.getInt(6));
				score.setSum(rs.getInt(7));
				score.setAvg(rs.getDouble(8));
				
				sList.add(student);
				cList.add(score);
			}
			
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
		
		RsList rsList = new RsList(sList, cList);
		return rsList;
	}

}


