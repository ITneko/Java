package JavaM_Chapter04_Example;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	
}

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();// x 값 읽기
			double y = sc.nextDouble();// y 값 읽기
			int radius = sc.nextInt();// 반지름 읽기
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0; i<c.length; i++) c[i].show();
		sc.close();
	}
}
