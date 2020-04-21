package JavaM_Chapter02_Example;

//8. 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점 (x1,y1), (x2,y2)를 입력받아
//(100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, xi, yi;
		
		System.out.print("점 (x1,y1),(x2,y2)의 좌표를 입력하시오>>");
		x = sc.nextInt();
		y = sc.nextInt();
		xi = sc.nextInt();
		yi = sc.nextInt();
		
		if((x>100 && x<200) && (y>100 && y<200) && (xi>100 && xi<200) && (yi>100 && yi<200)) 
			System.out.printf("(%d,%d)과(%d,%d)는 사각형 안에 있습니다.", x,y,xi,yi);
		else
			System.out.println("범위를 초과한 값입니다.");
	}

}
