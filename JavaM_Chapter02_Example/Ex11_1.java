package JavaM_Chapter02_Example;

//11. 숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,0,1의 경우 "겨울"을, 
//그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month;

		System.out.print("달을 입력하세요(1~12)>>");
		month = sc.nextInt();

		if (month >= 3 && month <= 5)
			System.out.println("봄");
		else if (month >= 6 && month <= 8)
			System.out.println("여름");
		else if (month >= 9 && month <= 11)
			System.out.println("가을");
		else if ((month == 12 || month <=2) && month!=0  )
			System.out.println("겨울");
		else
			System.out.println("Error!");

	}

}
