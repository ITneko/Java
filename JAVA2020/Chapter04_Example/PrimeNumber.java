package Chapter04_Example;

/*
1. 소수(PrimeNumber)구하기
소수는 1과 자기 자신으로만 나누어지는 수 입니다.
조건문과 반복문을 사용해 100이하의 소수를 출력해 보세요.
힌트 (for속의 for문) 
*/

public class PrimeNumber {

	public static void main(String[] args) {
		int cnt;
		for (int i = 1; i <= 100; i++) {
			cnt=0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					cnt++;
			}
			if (cnt == 2)
				System.out.print(i + " ");
			

		}
	}

	
}
//1 2 3 5 7 11 13 17 19 23 ...