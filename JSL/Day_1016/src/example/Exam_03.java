package example;
import java.util.*;
/*	키보드로 사원번호, 이름, 나이를 입력받아 Set에 저장 후
 *	사원번호를 기준으로 오름차순 출력하는 프로그램 작성
 *	1. 입력형식
 *	사원등록 : 1101,aaaa,28
 *	.	.	.	.	.	.
 *	2. 출력형식
 *	** 사원 목록 **
 *	사원번호	이름		나이
 *	1101	aaaa	28
 *	.	.	.	.	.	
 *	** 사원 번호순 **
 *	사원번호	이름		나이
 *	1101	aaaa	28
 *	.	.	.	.	.	
 * 	3. 처리조건
 * 	- 사원번호 중복시 "이미 등록된 사원입니다." 츨력하고 다시 입력
 * 	- 사원번호가 9999 이면 출력 후 종료
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Sawon> set = new HashSet<Sawon>();
		while(true) {
			System.out.print("입력: ");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("9999")) break;
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int age = Integer.parseInt(str[2]);
			
			set.add(new Sawon(bun, name, age));
				
		}
		System.out.println(" ** 사원 목록 ** ");
		for(Object obj : set) {
			System.out.println(obj);
		}
		
		System.out.println(" ** 사원 번호순 ** ");
		List<Sawon> list = new ArrayList<Sawon>(set);
		Collections.sort(list);
		for(Object obj : list) {
			System.out.println(obj);
		}

	}

}
