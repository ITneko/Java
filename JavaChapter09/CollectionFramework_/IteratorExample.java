package CollectionFramework_;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
