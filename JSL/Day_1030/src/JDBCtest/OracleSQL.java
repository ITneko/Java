package JDBCtest;

import java.sql.*;

public class OracleSQL extends OracleConn {
	Statement stmt = null;
	ResultSet rs = null;

	public void exam01() throws Exception {
		String query = "select ename, salary, salary*12 as sum from employee";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getString("salary") + "\t");
			System.out.println(rs.getString("sum") + "\t");
		}
	}

	public void exam02() throws Exception {
		String query = "select ename, salary, job, dno, nvl(commission,0) as 보너스, salary*12+nvl(commission,0) as 연봉 from employee";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		System.out.println("이름\t월급\t직업\t\t부서번호\t보너스\t연봉+보너스");
		while (rs.next()) {
			String str = rs.getString("job");
			if (str.length() < 8) {
				str += "\t";
			}
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getInt("salary") + "\t");
			System.out.print(str + "\t");
			System.out.print(rs.getInt("dno") + "\t");
			System.out.print(rs.getString("보너스") + "\t");
			System.out.println(rs.getInt("연봉") + "\t");
		}
	}

	@Override
	public void CleanUp() throws Exception {
		rs.close();
		stmt.close();
	}

}
