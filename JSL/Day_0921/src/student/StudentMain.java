package student;

import java.util.Scanner;

/* 키보드로 번호, 이름, 나이, 국어, 영어, 수학 점수를 입력받아서 
 * 다음과 같이 출력하는 프로그램 작성
 * 입력 : 1 이학생 28 90 89 80
 * 
 * 출력
 * 번호 이름 나이 국어 영어 수학 총점 평균
 *  1 이학생 28  90  89  80  xx  xx
 * 
 */


public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		StuData stu = new StuData(1, "이학생", 28,90,89,80);
		stu.studentPrint();
	}

}
