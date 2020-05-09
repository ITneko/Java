package JavaM_Chapter03_Example;

//양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] intarr = new int[10];

		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < intarr.length; i++)
			intarr[i] = sc.nextInt();

		System.out.print("3의 배수는 ");

		for (int i = 0; i < intarr.length; i++) {
			if(intarr[i]%3==0)
				System.out.printf("%d ",intarr[i]);
			
		}
	}
}
