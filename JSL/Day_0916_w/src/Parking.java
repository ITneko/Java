
public class Parking {
	String carNo; // 차량번호
	int parkTime; // 주차시간(분단위)
	int money; // 주차요금

	public Parking() {
	}

	public Parking(String carNo, int parkTime) {
		this.carNo = carNo;
		this.parkTime = parkTime;
		parkingFee();
	}

	// 10분 미만 무료, 30분까진 500원, 30분 이후는 10분당 500
	void parkingFee() {
		money = 0;
		if (parkTime >= 10 && parkTime <= 30) {
			money = 500;
		} else if (parkTime > 30) {
			int a = (parkTime - 30) / 10;
			money = a * 500 + 500;
			if ((parkTime - 30) % 10 != 0) {
				money += 500;
			}
			if (money > 30000)
				money = 30000;
		}
	}
	
	void view() {
		System.out.println(carNo + "\t" + parkTime + "\t" + money);
	}

}
