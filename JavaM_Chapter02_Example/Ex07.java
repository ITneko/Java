package JavaM_Chapter02_Example;

//7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다. (100,100)과 (200,200)의 두 점으로 이루어진 사각형이 있을 때,
//Scanner를 이용하여 정수 x와 y값을 입력받고 점(x,y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if ((x > 100 && x < 200) && (y > 100 && y < 200))
			System.out.printf("(%d,%d)는 사각형 안에 있습니다", x, y);
		else
			System.out.println("범위를 벗어난 값입니다.");
	}

}
