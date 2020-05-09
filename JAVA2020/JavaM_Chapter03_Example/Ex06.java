package JavaM_Chapter03_Example;

/*배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 
오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 
각 몇개로 변환되는지 예시와 같이 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
*/
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int one;
		
		System.out.print("금액을 입력하시오>>");
		one = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			if(unit[i]==50000)
				System.out.printf("%d원 짜리 : %d개", unit[i], (one/unit[i]));
			else
				System.out.printf("%d원 짜리 : %d개", unit[i], (one%unit[i-1])/unit[i]);
			System.out.println();
		}
	
	}

}
//one/50000
//one%50000/10000
//one%10000/1000
//one%1000/500
//one%500/100
//one%100/50
//one%50/10
//one%10/1