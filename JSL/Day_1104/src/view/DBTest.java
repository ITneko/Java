package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.EmpDAO;
import db.DBUtil;

public class DBTest {

	public static void main(String[] args) {
		Connection conn = DBUtil.getConnection();
		System.out.println("Connection" + conn);
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		EmpDAO dao = EmpDAO.getInstance();
		System.out.println("DAO :" + dao);
	}

}
