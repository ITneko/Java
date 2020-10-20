import java.util.TreeSet;

public class Exam_04 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(new Integer(88));
		treeSet.add(new Integer(98));
		treeSet.add(new Integer(80));
		treeSet.add(new Integer(78));
		treeSet.add(new Integer(85));
		treeSet.add(new Integer(58));
		treeSet.add(new Integer(78));

		Integer score = null;
		score = treeSet.first();
		System.out.println("가장낮은 점수 : " + score);
		
		score = treeSet.last();
		System.out.println("가장높은 값 : " + score);
		
		score = treeSet.lower(85);
		System.out.println("85의 바로 아랫 값 : " + score);
		
		score = treeSet.higher(85);
		System.out.println("85의 바로 윗 값 : " + score);
		
		score = treeSet.floor(85);
		System.out.println("85이거나 바로 아랫 값 : " + score);
		
		score = treeSet.ceiling(85);
		System.out.println("85이거나 바로 윗 값 : " + score);
		
		while(!treeSet.isEmpty()) {
			score = treeSet.pollFirst();
			System.out.print(score + "\t");
			System.out.println("남은 객체 수 : " + treeSet.size());
		}
		
	}

}
