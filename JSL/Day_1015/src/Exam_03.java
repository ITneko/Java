import java.util.LinkedList;
import java.util.Queue;

// Queue 인터페이스
public class Exam_03 {

	public static void main(String[] args) {
		Queue que = new LinkedList();
		
		que.offer("A");
		que.offer("B");
		que.offer("C");
		que.offer("D");
		
		System.out.println("요소수 :" + que.size());
		String str = (String)que.peek();
		System.out.println(str);
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		System.out.println("요소수 :" + que.size());
	}

}
