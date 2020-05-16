package Ex02;

public class Cat extends Animal implements IPet{
	public void eat() {
		System.out.println("고양이는 사료를 먹습니다.");
	}
	
	public void play() {
		System.out.println("고양이는 주인과 놀고있습니다.");
	}
}
