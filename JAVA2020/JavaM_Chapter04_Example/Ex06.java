package JavaM_Chapter04_Example;

import java.util.Scanner;

class Circle2{
	private double x,y;
	private int radius;
	
	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")" + radius;
	}
	
}

public class Ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=0;
		Circle2 c[] = new Circle2[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();// x 값 읽기
			double y = sc.nextDouble();// y 값 읽기
			int radius = sc.nextInt();// 반지름 읽기
			c[i] = new Circle2(x,y,radius);
		}
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c.length; j++) {
				if(c[i].getRadius() < c[j].getRadius())
					k = j;
			}
			
		}
		System.out.println("가장 면적이 큰 원은" + c[k].toString());
		
		sc.close();
	}
}
