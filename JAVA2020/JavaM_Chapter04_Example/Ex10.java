package JavaM_Chapter04_Example;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc="";
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.print("한글 단어>>");
			abc = sc.next();
			
			if(abc.equals("그만"))
				break;
			
			Ex10Dictionary.kor2Eng(abc);
		}
	}

}
