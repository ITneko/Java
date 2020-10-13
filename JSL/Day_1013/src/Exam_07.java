import java.util.*;
//<Integer> 제네릭 타입
public class Exam_07 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();	// int형만 받음
		list.add(100);
		list.add(200);
//		list.add("300");
		list.add(400);
		list.add(500);
		
		int tot=0;
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		for(int obj : list) {
			tot+=obj;
		}
		System.out.println(tot);
		tot=0;
		
		for(int i=0; i<list.size(); i++) {
			int score = list.get(i);
			tot+=score;
		}
		System.out.println(tot);
		
		
		
	}

}
