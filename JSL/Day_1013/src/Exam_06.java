import java.util.*;

// List - > ArrayList, LinkedList(비상연락망), Vector(동기화)
public class Exam_06 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add("Java");
		list.add(3.14);
		list.add('A');
		
		System.out.println("List : " + list);
		
		list.add(1, "김자바");
		System.out.println("List : " + list);
		
		for(int i=0; i<list.size(); i++) {
			Object str = list.get(i);
			System.out.println(str);
		}
		
		ArrayList aList = new ArrayList(10);
	}

}
