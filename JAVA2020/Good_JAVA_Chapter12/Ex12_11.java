package Good_JAVA_Chapter12;

interface Car11 {
	void work();
}

interface Cannon11 {
	void fire();
}

class Tank11 implements Car11, Cannon11 {
	public void work() {
		System.out.println("탱크가 앞으로 굴러갑니다.");
	}
	
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
	}
}

public class Ex12_11 {

	public static void main(String[] args) {
		Tank11 tank1 = new Tank11();
		tank1.work();
		tank1.fire();
	}

}
