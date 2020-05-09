package JavaM_Chapter03_Example;

/*
* 1~100 까지의 합을 구하되, 
* 10의 배수가 될때마다 결과를 출력하시오
* 
* 1~10 까지의 합계 55
* 1~20 까지의 합계 210
* 1~30 까지의 합계 465...
* 
*/
public class ForEx01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0)
				System.out.printf("1~%d 까지의 합계 : %d\n", i, sum);
		}
	}
}
