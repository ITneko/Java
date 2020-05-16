package Ex02;

public class Dog extends Animal implements IPet{
	public void eat() {
		System.out.println("강아지는 사료를 먹고있습니다.");
	}
	
	public void play() {
		System.out.println("강아지는 주인과 놀고있습니다.");
	}
}
