package JavaM_Chapter04_Example;

/*
 * 다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라
 * 	int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
 * 	x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
 * 	int square(): 사각형 넓이 리턴
 * 	void show(): 사각형의 좌표와 넓이를 화면에 출력
 *  boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
*/

public class Ex04 {

	public static void main(String[] args) {
		Ex04Rectangle r = new Ex04Rectangle(2, 2, 8, 7);
		Ex04Rectangle s = new Ex04Rectangle(5, 5, 6, 6);
		Ex04Rectangle t = new Ex04Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}
