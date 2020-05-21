package CollectionFramework_;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("one");
		boolean a = list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b = list.add("second");
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		Object o = list.get(1);
		System.out.println(o);
		
		int i = list.indexOf("second");
		System.out.println("second = " + i);
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list is Empty");
		}
	}

}
