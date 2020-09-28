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
		while(cnt<10) {
			System.out.print("자료입력 " + (cnt+1)+ " : ");
			String str[] = sc.nextLine().split(",");
			if("END".equals(str[0].toUpperCase())) 
				break;
			String str2[] =  str[1].split("-");
			int age;
			if("1256".contains(str2[1])) {
				age = 2020 - (Integer.parseInt(str2[0].substring(0,2))+1900); 
			}else {
				age = 2020 - (Integer.parseInt(str2[0].substring(0,2))+2000);
			}
			if("1357".contains(str2[1])) {
				str[1] = "남";
			}else {
				str[1] = "여";
			}
			
			data.member[cnt] = new Member(str[0],str[2],str[1],age);
			cnt++;
		}
		data.cnt = cnt;
		data.print();
	}

}
