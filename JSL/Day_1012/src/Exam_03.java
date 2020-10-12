import java.util.Calendar;
import java.util.GregorianCalendar;

// 그레고리력
public class Exam_03 {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String korDayOfWeek = "";
		switch (dayOfWeek) {
		case 1:
			korDayOfWeek = "일요일";
			break;
		case 2:
			korDayOfWeek = "월요일";
			break;
		case 3:
			korDayOfWeek = "화요일";
			break;
		case 4:
			korDayOfWeek = "수요일";
			break;
		case 5:
			korDayOfWeek = "목요일";
			break;
		case 6:
			korDayOfWeek = "금요일";
			break;
		case 7:
			korDayOfWeek = "토요일";
			break;
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		System.out.println(year + "-" + month + "-" + date + " " + korDayOfWeek + " " + hour + "시" + minute + "분");
	}

}
