package bank;

public class Transfer extends Thread{
	ShareArea shareArea;
	public Transfer(ShareArea area) {
		shareArea = area;
	}
	
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			synchronized (shareArea) {
				shareArea.account1.withdraw(100);
				System.out.println(shareArea.account1.ownerName + "계좌: 100만원 인출됨");
				shareArea.account2.deposit(100);
				System.out.println(shareArea.account2.ownerName + "계좌: 100만원 지급");
			}
			
		}
	}
}
