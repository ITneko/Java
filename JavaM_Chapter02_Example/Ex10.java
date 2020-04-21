package JavaM_Chapter02_Example;

//10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
//두 개의 원을 입력받고  두 원이 서로 겹치는지 판단하여 출력하라.
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x, y, rx, ry, r1, r2, a, b, distance;

		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		x = sc.nextDouble();
		y = sc.nextDouble();
		r1 = sc.nextDouble();

		System.out.print("두번째 원의 중심과 반지름 입력>>");
		rx = sc.nextDouble();
		ry = sc.nextDouble();
		r2 = sc.nextDouble();

		a = Math.pow((x - rx), 2);
		b = Math.pow((y - ry), 2);
		distance = Math.sqrt(a + b);

		if (distance <= (a + b))
			System.out.println("두 원은 서로 겹친다");
		else
			System.out.println("두 원은 겹치지 않는다");

	}

}
