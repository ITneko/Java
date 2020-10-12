import java.util.Calendar;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		System.out.println(" 일   월   화  수   목   금  토");

		cal.set(year, month-1, 1);
		int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) {
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if(dayOfWeek%7==0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println();

	}

}
