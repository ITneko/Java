import java.util.*;

/* 검색기능이 강화된 컬렉션(자동정렬)
 * TreeSet, TreeMap
 * 2진트리구조
 */
public class Exam_02 {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(90);
		tSet.add(50);
		tSet.add(20);
		tSet.add(60);
		tSet.add(80);
		tSet.add(95);
		tSet.add(30);
		tSet.add(40);
		tSet.add(90);
		
		System.out.println(tSet);
	}

}
