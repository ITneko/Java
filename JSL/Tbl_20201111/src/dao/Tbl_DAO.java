package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utr.DBUtil;
import vo.City_VO;
import vo.Member_VO;
import vo.Money_VO;

public class Tbl_DAO {
	private Tbl_DAO() {
	};

	private static Tbl_DAO instance = new Tbl_DAO();

	public static Tbl_DAO getInstance() {
		return instance;
	}

	public int insertMember(Member_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Member_VO mem = null;
		int row = 0;
		String sql = "insert into tbl_member_20201111 values(?,?,?,?,?,?,?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			mem = x;
			pstmt.setInt(1, mem.getCustno());
			pstmt.setString(2, mem.getCustname());
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getGender());
			pstmt.setString(5, mem.getJoindate());
			pstmt.setString(6, mem.getGrade());
			pstmt.setString(7, mem.getCity());

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
				e.printStackTrace();
			}

		}
		return row;
	}

	public int insertMoney(Money_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Money_VO mem = null;
		int row = 0;
		String sql = "insert into tbl_money_20201111 values(?,?,?,?,?,?,?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);

			mem = x;
			pstmt.setInt(1, mem.getCustno());
			pstmt.setInt(2, mem.getSaleno());
			pstmt.setInt(3, mem.getPcost());
			pstmt.setInt(4, mem.getAmount());
			pstmt.setInt(5, mem.getPrice());
			pstmt.setString(6, mem.getPcode());
			pstmt.setString(7, mem.getSdate());
			row = pstmt.executeUpdate();

		} catch (

		Exception e) {
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
		return row;
	}

	public int insertCity(City_VO x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		City_VO mem = null;
		int row = 0;
		String sql = "insert into tbl_city_20201111 values(?,?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			mem = x;
			pstmt.setString(1, mem.getCity());
			pstmt.setString(2, mem.getCityname());
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
				e.printStackTrace();
			}

		}
		return row;
	}

	// 도시코드 검색 메소드
	public int cityCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		City_VO mem = null;
		int row = 0;
		String sql = "select count(*) from tbl_city_20201111";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				row = rs.getInt(1);
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
		return row;
	}

	public List<Member_VO> memberList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Member_VO> eList = new ArrayList<Member_VO>();
		Member_VO mem = null;

		int row = 0;
		//String sql = "select custno, custname, phone, gender, joindate, grade, cityname from tbl_member_20201111 m, tbl_city_20201111 c where m.city=c.city order by custno";
		String sql = "select custno, custname, phone, case when gender='M' then '남' when gender='F' then '여' end as gender, joindate, decode(grade, 'A', 'VIP','B' , '일반','C', '직원')" + 
				" as grade," + 
				" cityname from tbl_member_20201111 M, tbl_city_20201111 C" + 
				" where m.city=c.city order by custno";
				
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				mem = new Member_VO();

				mem.setCustno(rs.getInt(1));
				mem.setCustname(rs.getString(2));
				mem.setPhone(rs.getString(3));
				mem.setGender(rs.getString(4));
				mem.setJoindate(rs.getString(5));
				mem.setGrade(rs.getString(6));
				mem.setStringTemp(rs.getString(7));
				eList.add(mem);
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
		return eList;
	}

	public int custnoCheack(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member_VO mem = null;

		int row = 0;
		String sql = "select custno from tbl_member_20201111";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getInt(1) == x) {
					row = 1;
					break;
				}
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
		return row;
	}
	
	public int custnoNext() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int x = 0;
		String sql = "select max(custno) from tbl_member_20201111";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			x = rs.getInt(1);
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
		return x;
	}
	
	public int custnoSeq() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int x = 0;
		String sql = "select tbl_member_seq_custno.nextval from dual";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			x = rs.getInt(1);
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
		return x;
	}
	
	public List<Member_VO> memberSaleList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Member_VO> eList = new ArrayList<Member_VO>();
		Member_VO mem = null;

		int row = 0;
		String sql = "select custno, custname, phone, grade, sum(price) from(select a.custno, custname, phone, grade, price from tbl_member_20201111 A, tbl_money_20201111 B where a.custno=b.custno) group by custno, custname,phone, grade order by sum(price) desc";
				
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				mem = new Member_VO();

				mem.setCustno(rs.getInt(1));
				mem.setCustname(rs.getString(2));
				mem.setPhone(rs.getString(3));
				mem.setGrade(rs.getString(4));
				mem.setIntTemp(rs.getInt(5));
				
				eList.add(mem);
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
		return eList;
	}

}
