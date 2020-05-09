package JavaM_Chapter02_Example;

//6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고
//두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		while (true) {
			System.out.print("1~99 사이의 정수를 입력하시오>>");
			a = sc.nextInt();
			if (a > 0 || a < 99)
				break;
			else
				System.out.println("입력 범위를 벗어났습니다!");
		}
		
		b = a/10;
		c = a%10;
		
		if(b/1==0) 
			b=1;
		if(c/1==0)
			c=1;
		if(b%3==0 && c%3==0)
			System.out.println("박수짝짝");
		else if(b%3==0 || c%3==0)
			System.out.println("박수짝");
		else
			System.out.println("땡!");
	}

}
