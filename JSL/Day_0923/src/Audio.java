
public class Audio implements Control {

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
	}

}
