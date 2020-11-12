package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Tbl_DAO;
import vo.City_VO;

public class CityInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<City_VO> x = new ArrayList<City_VO>();
		City_VO city = null;
		System.out.println("도시코드와 도시명을 입력하시오.");
		while(true) {
			city = new City_VO();
			city.setCity(sc.next());
			if(city.getCity().equals("00")) break;
			city.setCityname(sc.next());
			x.add(city);
		}
		System.out.println("입력완료");
		Tbl_DAO DAO = Tbl_DAO.getInstance();
		DAO.setCity(x);
		
	}
	
}
