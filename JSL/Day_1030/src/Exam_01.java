/*	JDBC Programming
 * 	1. 드라이버 로딩 : Class.forName();
 * 	2. 커넥션 : Connection c = DriverManager.getConnection();
 * 	3. 명령문 쿼리 : Statement(1회성), PreparedStatement(계속 쓸 수 있음)
 * 	4. 쿼리 : executeQuery();
 * 
 */

import java.sql.*;
public class Exam_01 {

	public static void main(String[] args) {
		String myURL = "jdbc:oracle:thin:@localhost:1521:XE";
		String myID = "jslhrd46";
		String myPass = "1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //select 쓸때 필수
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("커넥션 연결");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
//				int eno = rs.getInt("eno");
//				String ename = rs.getString(2);
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
