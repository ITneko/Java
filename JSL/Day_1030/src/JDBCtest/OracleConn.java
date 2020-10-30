package JDBCtest;

import java.sql.*;

public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:XE";
	private String myID = "jslhrd46";
	private String myPass = "1234";
	protected Connection myConn;

	public OracleConn() {}
	
	public void makeConn() throws Exception{
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL,myID,myPass);
	}
	
	public abstract void CleanUp() throws Exception;
	
	public void takeDown() throws Exception{
		CleanUp();
		myConn.close();
	}
	
}
