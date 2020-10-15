import java.util.*;

public class Exam_01 {

	static void print(ArrayList<Integer> a, ArrayList<Integer> a2) {
		System.out.println("a : " + a);
		System.out.println("a2 : " + a2);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(6));
		a.add(new Integer(4));
		a.add(new Integer(3));
		a.add(new Integer(2));
		a.add(new Integer(1));

		ArrayList<Integer> a2 = new ArrayList<Integer>(a.subList(0, 3));
		
		print(a,a2);
		Collections.sort(a);
		Collections.sort(a2);
		a2.add(new Integer(10));
		a2.add(new Integer(40));
		a2.add(new Integer(20));
		
		print(a,a2);
	}

}
