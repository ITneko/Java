
public interface Control { // 일반변수를 써도 static final이 적용
	static final int MAX_VOLUME = 10; // static final
	int MIN_VOLUME = 0;

	// 추상 메소드 정의
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
