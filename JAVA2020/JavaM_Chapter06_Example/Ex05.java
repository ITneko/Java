package JavaM_Chapter06_Example;

import java.util.Calendar;

public class Ex05 {

	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		int hour, min;
		
		hour = time.get(Calendar.HOUR_OF_DAY);
		min = time.get(Calendar.MINUTE);
		
		System.out.println("현재 시간은 " + hour + "시 " +  min + "분입니다.");
		if(4<= hour && hour<12)
			System.out.println("Good Morning");
		else if(hour < 18)
			System.out.println("Good Afternoon");
		else if(hour < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		
	}

}
