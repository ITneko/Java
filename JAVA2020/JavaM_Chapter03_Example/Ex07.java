package JavaM_Chapter03_Example;

//정수를 10개 저장하는 배열을 만들고, 1~10까지의 범위의 정수를 랜덤 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라
//랜덤한 정수들 : 10 5 2 9 1 4 1 5 1 5
//평균은 4.3

public class Ex07 {

	public static void main(String[] args) {

		int randValue;
		int[] intarr = new int[10];
		int sum = 0;
		
		System.out.print("랜덤한 정수들 : ");
		
		for (int i = 0; i < intarr.length; i++) {
			randValue = (int) (Math.random() * 10) + 1;
			intarr[i] = randValue;
			sum += intarr[i];
			System.out.printf("%d ", intarr[i]);
		}
		
		System.out.println();
		System.out.printf("평균은 %.1f", ((double) sum / intarr.length));

	}

}
