package JDBCtest;

public class Exam_03 {

	public static void main(String[] args) throws Exception {
		OracleSQL sql = new OracleSQL();
		sql.makeConn();
		sql.exam02();
		sql.takeDown();
	}

}
