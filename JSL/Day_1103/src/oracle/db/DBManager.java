package oracle.db;
//싱글톤

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {}
	private static DBManager instance = new DBManager();
	
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		Connection myConn = null;
		
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "jslhrd46";
		String myPass = "1234";
		
		try {
			Class.forName(myDriver);
//			System.out.println("드라이버 로딩됨");
			myConn = DriverManager.getConnection(myURL,myID,myPass);
//			System.out.println("커넥션 연결");
		}catch(Exception e) {
			System.out.println("드라이버 또는 커넥션 연결 실패");
			e.printStackTrace();
		}
		return myConn;
	}
}
