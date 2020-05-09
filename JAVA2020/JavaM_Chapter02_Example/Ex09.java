package JavaM_Chapter02_Example;

//9. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 
//그리고 실수 값으로 다른 점(x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, rx, ry;
		double r, a, b, distance;

		System.out.print("원의 중심과 반지름 입력>>");
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextDouble();

		System.out.print("점 입력>>");
		rx = sc.nextInt();
		ry = sc.nextInt();

		a = Math.pow((x - rx), 2);
		b = Math.pow((y - ry), 2);
		distance = Math.sqrt(a + b);
//		System.out.println(a + "\t" + b + "\t" + distance);
		if (distance < r)
			System.out.println("점(" + x + "," + y + ")는 원 안에 있다");
		else
			System.out.println("점(" + x + "," + y + ")는 원 안에 없다");

	}

}
