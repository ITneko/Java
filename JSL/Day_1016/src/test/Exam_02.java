package test;

import java.util.*;

class AA implements Comparable<AA>{
	int bun;
	String name;

	AA() {
	}

	AA(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	@Override
	public String toString() {
		return bun + "\t" + name;
	}

	@Override
	public int compareTo(AA o) {
		if(bun <o.bun) {
			return -1;
		}else if(bun==o.bun) {
			return 0;
		}else {
			return 1;
		}
	}
	
	
}

public class Exam_02 {

	public static void main(String[] args) {
		Set<AA> set = new HashSet<AA>();
		
		set.add(new AA(5,"AAA"));
		set.add(new AA(3,"BBB"));
		set.add(new AA(1,"DDD"));
		set.add(new AA(4,"BBB"));
		set.add(new AA(7,"KKK"));
		System.out.println(set);
		
		List<AA> list = new ArrayList<AA>(set);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
