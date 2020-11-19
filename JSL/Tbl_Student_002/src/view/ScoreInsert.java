package view;

import java.util.Scanner;
import java.util.regex.Pattern;

import dao.Tbl_DAO;
import vo.Score_VO;

public class ScoreInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tbl_DAO manager = Tbl_DAO.getInstance();
		Score_VO score = null;
		String hakbunpattern = "\\d{4}";
		while (true) {
			score = new Score_VO();
			System.out.print("학번: ");
			String hakbun = "0";
			int raw = 0;
			while (true) {
				hakbun = sc.next();
				boolean bool = Pattern.matches(hakbunpattern, hakbun);
				if (bool) {
					System.out.println("ok");
					break;
				} else {
					System.out.println("4자리를 입력해주세요");
				}
			}
			if(hakbun.equals("0000")) break;
			score.setHakbun(hakbun);
			int cnt = 0;
			String str[] = { "국어", "영어", "수학" };
			while (true) {
				int tmp=-1;
				if (cnt == 3) {
					break;
				}
				while (!(0 <= tmp) && !(tmp >= 100)) {
					System.out.print(str[cnt] + "점수를 입력해주세yo");
					tmp = sc.nextInt();
				}
				switch(cnt) {
				case 0:
					score.setKor(tmp); break;
				case 1:
					score.setEng(tmp); break;
				case 2:
					score.setMat(tmp); break;
				}
				cnt++;
			}
			
			raw = manager.scoreInsert(score);
			if(raw==1) {
				System.out.println("등록성공!");
			}else {
				System.out.println("등록실패");
			}
		}

	}

}
