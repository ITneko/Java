import java.util.Stack;

// Stack
public class Exam_02 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack.size());
		String str = (String)stack.peek();//가장 위에 있는걸 꺼내지만 제거되진 않음
		System.out.println(str);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.size());
	}

}
