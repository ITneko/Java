package JavaM_Chapter02_Example;

//3. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권 , 천 원권, 500원짜리 동전, 100원짜리 동전, 
//50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d,e,f,g,h,won;
		System.out.print("금액을 입력하시오>>");
		won = scanner.nextInt();
		a = won/50000;
		b = (won%50000)/10000;
		c = (won%10000)/1000;
		d = (won%1000)/500;
		e = (won%500)/100;
		f = (won%100)/50;
		g = (won%50)/10;
		h = (won%10)/1;
		System.out.printf("오만원권 %d매\n만원권 %d매\n천원권 %d매\n오백원 %d매\n백원 %d매\n오십원 %d매\n십원 %d매\n일원 %d매\n",a,b,c,d,e,f,g,h);
	}

}
