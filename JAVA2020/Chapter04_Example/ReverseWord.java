package Chapter04_Example;

/*
2. 단어 거꾸로 출력하기
자바의 Scanner 객체를 이용하면 콘솔에 데이터를 입력할 수 있습니다.
Scanner객체와 for문을 같이 이용해서 입력한 단어를
거꾸로 출력해 보세요.
*/
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하시오>>");
		String str = sc.nextLine();
		
		for(int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
		sc.close();
	}

}
