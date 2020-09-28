import java.util.Scanner;

/*	자료입력 1 : 홍길동,900206-1,010-2242-3810
 *  자료입력 2 : 김지바,071015-4,010-1111-2222
 *  자료입력 3 : 홍자동,890723-1,010-2222-3333
 *  
 *  자료입력 n : end 또는 END(End) - > 대소문자 구분없음
 *  
 *  출력형식
 *  이름		전화			성별	나이
 *  홍길동 010-2242-3810	남	30
 *  김지바 010-1111-2222	여	12
 *  홍자동 010-2222-3333	남	31
 *   
 * 
 */
public class Member_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberData data = new MemberData();
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("자료입력 " + (cnt+1) + ": ");
			String str = sc.nextLine();
			if (str.charAt(0) == 'e' || str.charAt(0) == 'E')
				break;
			String str2[] = str.split(",");
			String name = str2[0];
			String age2[] = str2[1].split("-");
			String tel = str2[2];
			
			int age = Integer.parseInt(age2[0].substring(0, 2)); // 생년월일
			if("3478".contains(age2[1])) {
				age = 2020-(2000+age);
			}else
				age = 2020-(1900+age);
					
			int ss = Integer.parseInt(age2[1]);	// 성별
			String gender = data.setGender(ss);

			data.member[cnt] = new Member(name,tel,gender,age);
			cnt++;
		}
		data.cnt = cnt;
		data.print();
		
	}

}
