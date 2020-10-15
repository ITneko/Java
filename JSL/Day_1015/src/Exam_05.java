import java.util.*;

//난수를 이용한 Lotto
public class Exam_05 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 6) {
			int r = (int) (Math.random() * 45) + 1;
			set.add(r);
		}
		System.out.println(set);
		List list = new LinkedList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
