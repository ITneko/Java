package JDBCtest;

public class Exam_02{

	public static void main(String[] args) throws Exception{
		OracleSQL sql = new OracleSQL();
		sql.makeConn();
		sql.exam01();
		sql.takeDown();
	}

}
