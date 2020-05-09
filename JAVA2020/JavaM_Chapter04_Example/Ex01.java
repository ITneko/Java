package JavaM_Chapter04_Example;

//1. 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.

public class Ex01 {
	
	public static void main(String[] args) {
		Ex01TV myTV = new Ex01TV("LG", 2017,32); // LG에서 만든 2017년 32인치
		myTV.show();
	}
}
