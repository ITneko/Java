import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Set 인터페이스 -> HashSet 순서x, 중복x
public class Exam_04 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Java");
		set.add("JSL");
		set.add("HRD");
		set.add("Servlet");
		set.add("Oracle");
		set.add("JSL");
		
		System.out.println(set);
		
		//반복자를 이용해서 꺼내야 순차적으로 나옴
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		LinkedHashSet s = new LinkedHashSet();	//순서o,중복x
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(3);
		System.out.println(s.size());
		for(Object obj : s) {
			System.out.println(obj);
		}
	}

}
