import java.util.Set;
import java.util.TreeSet;

public class Exam_03 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		int score[] = {85,90,50,88,75,35,67,78};
		
		for(int i=0; i<score.length; i++) {
			treeSet.add(score[i]);
		}
		
		System.out.println(treeSet);
		//75보다 작은값
		System.out.println(treeSet.headSet(new Integer(75)));
		
		//75보다 큰값
		Set set = treeSet.tailSet(75);
		System.out.println(set);
	}

}
