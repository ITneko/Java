
public class Tv implements Control {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
	}

}
