package CollectionFramework_;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");
		
		for(String str : ts) {
			System.out.print(str + "\t");
		}
	}

}
