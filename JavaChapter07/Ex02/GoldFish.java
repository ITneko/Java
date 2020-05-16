package Ex02;

public class GoldFish extends Fish implements IPet{
	public void swim() {
		System.out.println("금붕어는 헤엄치고 있습니다.");
	}

	public void play() {
		System.out.println("금붕어는 물속에서 놀고있습니다.");
	}
}
