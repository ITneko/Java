import java.util.Scanner;

@FunctionalInterface
interface MaxScore{
	public int maxScore(int[] score);
}
public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키보드로 7개의 정수를 입력 받아 최대값을 찾아서 출력
		int[] score = new int[7];
		//데이터 입력
		System.out.print("데이터 입력(7): ");
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		//람다식 정의 및 호출
		MaxScore ms;
		ms=(score2)->{
			int max=score2[0];
			for(int i=0; i<score2.length-1; i++) {
				if(score2[i]< score2[i+1]) {
					max= score2[i+1];
				}
			}
			return max;
		};
		
		System.out.println(ms.maxScore(score));
	}

}
