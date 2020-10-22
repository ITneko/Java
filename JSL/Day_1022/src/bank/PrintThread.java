package bank;
// 계좌 잔액 출력 스레드
public class PrintThread extends Thread{
	ShareArea shareArea;
	
	public PrintThread(ShareArea area) {
		shareArea = area;
	}
	
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			synchronized (shareArea) { //동기화 코드 블럭
				int sum = shareArea.account1.balance+shareArea.account2.balance;
				System.out.println("계좌잔액합계: "+ sum);
			}
			try {
				Thread.sleep(2);
			}catch(Exception e) {}
		}
	}
}
