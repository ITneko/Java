package Chapter04_Example;

import java.util.Random;

/*
3. 로또 번호 추출하기
앞에서 배운 난수 발생과 반복문, 조건문을 통해 중복되는 번호없이
1~45 까지의 숫자 중 6개의 숫자를 랜덤추출하고
콘솔에 출력해보세요.
힌트(while문 속의 for문)
*/

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = { 0, 0, 0, 0, 0, 0 };
		int index = 0;

		while (true) {
			int rand = (int) (Math.random() * 45) + 1;
			int i = 0;
			for (i = 0; i < index; i++) {
				if (rand == lotto[i]) {
					break;
				}
			}
			if (index == i) {
				lotto[index++] = rand;
			}
			if (index > 5)
				break;

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}

	}

}
