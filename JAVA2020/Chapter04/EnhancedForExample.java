package Chapter04;

/* 배열, Collection 객체 등의 내용을 모두 소진하기 위한 용도
 * for(엘리먼트 선언 : 배열 또는 컬렉션의 레퍼런스) {
 * 실행문;
 *  }
*/
public class EnhancedForExample {

	public static void main(String[] args) {

		String[] weekArray = { "Sunday", "Monday", "Tuesday", "Thursday", "Wednesday", "Friday", "Saturday" };
		for(String day : weekArray) {
			System.out.println(day);
		}
		System.out.println();
		for(int i=0; i<weekArray.length; i++) {
			System.out.println(weekArray[i]);
		}
	}

}
