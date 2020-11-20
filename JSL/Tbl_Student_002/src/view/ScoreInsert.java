package view;

import java.text.DecimalFormat;
import java.util.List;
/*
 * 학번 : 1101
 *  - 학번이 학생정보테이블에 존재하지 않을 경우 XXXX학번은 존재하지 않습니다. 경고출력
 *	  문구를 출력 후 재입력
 *	
 *	각 점수는 숫자만 입력 가능하도록하며 (0~100)값만 입력가능하도록 구현
 *	- 학번이 0000이면 다음과 같이 출력 후 종료
 *	[출력형식]
 *	학번	이름	성별	국어	영어	수학	총점	평균
 */
import java.util.Scanner;
import java.util.regex.Pattern;

import dao.Tbl_DAO;
import vo.Score_VO;
import vo.Student_VO;

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
					raw = manager.hakbunCheck(hakbun);
					if(raw != Integer.parseInt(hakbun)) {
						System.out.println(hakbun+"은 존재하지 않습니다.");
						continue;
					}
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
		DecimalFormat df = new DecimalFormat("###.00");
		RsList rsList = manager.scoreList();
		List<Student_VO> sList = rsList.getsList();
		List<Score_VO> cList = rsList.getcList();
		int cnt = 0;
		System.out.println("학번\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<sList.size(); i++) {
				System.out.println(sList.get(i).getHakbun()+"\t"+sList.get(i).getName()+"\t"
			+sList.get(i).getGender()+"\t"+cList.get(i).getKor()+"\t"+cList.get(i).getEng()+"\t"
						+cList.get(i).getMat()+"\t"+cList.get(i).getSum()+"\t"+df.format(cList.get(i).getAvg()));
			}
			
		}
}
