package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Tbl_DAO;
import vo.City_VO;

public class CityInsert {
	public static void main(String[] args) {
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		Scanner sc = new Scanner(System.in);
		City_VO city = null;
		int row = 0;
		System.out.println("도시코드와 도시명을 입력하시오.");
		while (true) {
			city = new City_VO();
			city.setCity(sc.next());
			if (city.getCity().equals("00"))
				break;
			city.setCityname(sc.next());
			row = DAO.insertCity(city);
			if (row == 1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		}

	}

}
