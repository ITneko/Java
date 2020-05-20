//package ExceptionHandling_;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//public class Sub extends Super {
//	//부모가 throws하지 않는 Exception을 throws할 수 없다.
//	public void doIt() throws SQLException {
//		System.out.println("Sub.doIt");
//		try {
//			super.doIt();
//		} catch (IOException e) {
//			throw new SQLException(e.getMessage());
//		}
//	}
//
//}
