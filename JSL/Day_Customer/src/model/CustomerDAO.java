package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.Customer_VO;

public class CustomerDAO {
	private CustomerDAO() {
	}

	private static CustomerDAO instance = new CustomerDAO();

	public static CustomerDAO getInstance() {
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

	public List<Customer_VO> customerList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Customer_VO> cList = new ArrayList<Customer_VO>();
		Customer_VO x = null;
		ResultSet rs = null;
		String sql = "select num, name, tel, addr, office, birthday, case when sex='M' then '남' when sex='F' then '여' end as sex, indate from tbl_customer order by num";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				x = new Customer_VO();
				x.setNum(rs.getInt(1));
				x.setName(rs.getString(2));
				x.setTel(rs.getString(3));
				x.setAddr(rs.getString(4));
				x.setOffice(rs.getString(5));
				x.setBirthday(rs.getString(6));
				x.setSex(rs.getString(7));
				x.setIndate(rs.getDate(8));
				cList.add(x);
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

	public int customerInsert(Customer_VO y) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Customer_VO x = null;
		String sql = "insert into tbl_customer values (tbl_customer_num_seq.nextval,?,?,?,?,?,?,SYSDATE)";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			x = y;
			pstmt.setString(1, x.getName());
			pstmt.setString(2, x.getTel());
			pstmt.setString(3, x.getAddr());
			pstmt.setString(4, x.getOffice());
			pstmt.setString(5, x.getBirthday());
			pstmt.setString(6, x.getSex());

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

	public Customer_VO customerSearch(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Customer_VO x = null;
		ResultSet rs = null;
		String sql = "select * from tbl_customer where name=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x = new Customer_VO();
				x.setNum(rs.getInt(1));
				x.setName(rs.getString(2));
				x.setTel(rs.getString(3));
				x.setAddr(rs.getString(4));
				x.setOffice(rs.getString(5));
				x.setBirthday(rs.getString(6));
				x.setSex(rs.getString(7));
				x.setIndate(rs.getDate(8));
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
		return x;

	}

	public int customerModify(String x, String y, int z) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update tbl_customer set tel=? , office=? where num=?";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			pstmt.setString(2, y);
			pstmt.setInt(3, z);
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

	public String customerNumCheck(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from tbl_customer where num=?";
		String temp = "";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, x);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				temp=rs.getString(1);
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
		return temp;

	}
	
	public int customerDelete(int x) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from tbl_customer where num=?";
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
	
	public Customer_VO customerList2(int y) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Customer_VO x = null;
		ResultSet rs = null;
		String sql = "select num, name, tel, addr, office, birthday, case when sex='M' then '남' when sex='F' then '여' end as sex, indate from tbl_customer where num=? order by num";
		int raw = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				x = new Customer_VO();
				x.setNum(rs.getInt(1));
				x.setName(rs.getString(2));
				x.setTel(rs.getString(3));
				x.setAddr(rs.getString(4));
				x.setOffice(rs.getString(5));
				x.setBirthday(rs.getString(6));
				x.setSex(rs.getString(7));
				x.setIndate(rs.getDate(8));
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
		return x;

	}

}
