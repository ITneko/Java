package test;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JSL");
		set.add("HRD");
		set.add("Servlet");
		set.add("Oracle");
		
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
