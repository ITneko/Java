import java.util.Scanner;

/* 입력 : 5, 홍길동,90,90,80
 * 입력 : 1 , 김길동, 95,90,80
 * 학생인원은 최대 10명
 * 입력자료는 번호가 무작위로 입력됨
 * 입력 항목 유효성 검사를 수행
 * (1) 번호는 (1~10) 사이의 정수
 * (2) 이름은 (1~10) 자 이내의 문자
 * (3) 각점수는 (0~100) 사이의 점수
 * 1,2,3 중에 하나라도 오류가 있을 경우 "경고메시지" 출력 후 재입력한다
 * 번호,이름이 같으면 "등록된 자료입니다" 경고 출력 후 재입력한다
 * 출력시 번호를 기준으로 오름차순 출력
 * 번호 이름 국어 영어 수학 총점 평균 석차
 */
public class StudentExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School school = new School();
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("입력 : ");
			String str[] = sc.nextLine().split(",");
			for (int i = 0; i < str.length; i++) {
				str[i] = str[i].trim();
			}
			if ("END".equals(str[0].toUpperCase()))
				break;
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);

			if (bun > 0 && bun <= 10) {
				if (name.length() > 0 && name.length() <= 10) {
					if (kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
						if(cnt!=0) {
							 if(school.ok(bun,name,cnt)) {
								 System.out.println("등록된 자료입니다!");
								 continue;
							 }
						}
						int tot = kor + eng + mat;
						double ave = Math.round(tot * 100. / 3) / 100.;
						school.student[cnt] = new Student(bun, name, kor, eng, mat, tot, ave);
					}else {
						System.out.println("점수 입력 범위를 초과하였습니다!");
						continue;
					}

				}else {
					System.out.println("이름의 입력 범위를 초과하였습니다!");
					continue;
				}
			}else {
				System.out.println("번호의 입력 범위를 초과하였습니다!");
				continue;
			}

			cnt++;
		}
		school.setCnt(cnt);
		school.print();
	}

}