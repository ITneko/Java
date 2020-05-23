package JavaM_Chapter05_Example;

import java.util.Scanner;

public class GraphicEditor {
	Scanner sc = new Scanner(System.in);
	
	public GraphicEditor() {
		
	}
	
	void insert(int num) {
		System.out.print("Line(1), Rect(2), Circle(3)>> ");
		
		
	}
	
	void delete() {
		
	}
	
	void view() {
		
	}
	
	void finish() {
		System.out.println("beauty를 종료합니다");
		System.exit(0);
	}
	
	void run() {
		int num;
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			switch(num = sc.nextInt()) {
			case 1:
				insert(num);
				break;
			case 2:
				delete();
				break;
			case 3:
				view();
				break;
			case 4:
				finish();
				default :
					System.out.println("잘못된 값을 입력하셨습니다.");
					break;
			}
		}
	}
}
