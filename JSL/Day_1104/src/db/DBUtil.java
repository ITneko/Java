package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection() {
		Connection conn = null;

		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "jslhrd46";
		String myPass = "1234";

		try {
			Class.forName(myDriver);
//			System.out.println("드라이버 로딩됨");
			conn = DriverManager.getConnection(myURL, myID, myPass);
//			System.out.println("커넥션 연결");
		} catch (Exception e) {
			System.out.println("드라이버 또는 커넥션 연결 실패");
			e.printStackTrace();
		}
		return conn;
	}
}
