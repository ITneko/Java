import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exam_05 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("현재 날짜: " + now);
		LocalTime time = LocalTime.now();
		System.out.println("현재 시간: " + time);
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println("현재 날짜&시간: " + now2);
		
	}

}
