package util;

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
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
		} catch (Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

		return conn;
	}
}
