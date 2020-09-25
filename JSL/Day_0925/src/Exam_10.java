import java.util.Scanner;

/*	키보드로 영문 단어를 A~Z 글자 수를 추출(대소문자 구분 x) 65~90
 * 	입력 : Apple
 * 	입력 : seoul
 * 	입력 : korea
 * 	.	.	.	.
 * 	입력 : -99 입력 종료
 * 
 *	출력
 *	A : x번
 *	B : x번
 *	...
 *	Z : x번
 * 	
 */
public class Exam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alpha[] = new int[26];
		while (true) {
			System.out.print("입력 : ");
			String str1 = sc.next();
			if (str1.equals("-99"))
				break;
			str1 = str1.toUpperCase();
			for (int i = 0; i < str1.length(); i++) {
				int cnt = 1;
				char temp = str1.charAt(i);
				alpha[90-temp] += cnt;
			}
		}
		char y = 'A';
		for(int i =alpha.length-1; i>=0; i--) {
			System.out.println(y + " : " + alpha[i] +"번");
			y++;
		}
	}

}
