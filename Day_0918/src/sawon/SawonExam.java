package sawon;

import java.util.Scanner;

// 사원정보입력 -> 객체 생성 - > 출력
// 부서명	사번	이름	급여
public class SawonExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
//		System.out.println("부서명\t사번\t이름\t급여");
//		System.out.println("---------------------------");
		while(cnt<10) {
			System.out.print("사원정보 : ");
			String department = sc.next();
			if(department.equals("end")|| department.equals("END")) 
				break;
			int bun = sc.nextInt();
			String name = sc.next();
			int pay = sc.nextInt();
			SawonData.sawon[cnt] = new Sawon(department, bun, name, pay);
			cnt++;
		}
		SawonData.count=cnt;
		SawonData.print();
		
	}

}
/*
인사 1101 AAAA 10000
인사 1302 BBBB 15500
총무 3402 DDDD 21200
총무 1340 EEEE 13102
총무 2345 SSSS 34110
자재 1234 GGGG 12345
*/