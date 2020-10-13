import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exam_08 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Java");
		sList.add("DataBase");
		sList.add("Python");
		sList.add(2,"JavaScript");
		sList.add("Java");
		
		System.out.println(sList);
		sList.remove(0);
		System.out.println(sList);
		sList.set(1, "Oracle");
		System.out.println(sList);
		
		//1
		for(int i=0; i<sList.size(); i++) {
			String str = sList.get(i);
			System.out.print(str +"\t");
		}
		System.out.println();
		
		//확장for문
		for(String str : sList) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		//반복자
		Iterator<String> iter = sList.listIterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.print(s + "\t");
		}
		System.out.println();
		Collections.sort(sList); // 객체정렬(기본자료형만 가능,사용자정의클래스 불가)
		System.out.println(sList);
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(78);
		iList.add(88);
		iList.add(70);
		iList.add(75);
		iList.add(90);
		System.out.println(iList);
		Collections.sort(iList);
		System.out.println(iList);
	}

}
