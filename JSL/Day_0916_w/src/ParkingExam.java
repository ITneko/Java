import java.util.Scanner;

public class ParkingExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking pk[] = new Parking[100];
		int cnt = 0;
		
		while(cnt<100) {
			System.out.print("주차정보 : ");
			String carNo = sc.next();
			if(carNo.equals("0000"))
				break;
			int parkTime = sc.nextInt();
			pk[cnt] = new Parking(carNo, parkTime);
			cnt++;
		}
		
		System.out.println("\n자동차번호\t주차시간\t주차요금");
		for(int i = 0; i<cnt; i++) {
			pk[i].view();
		}
		
	}

}
