import java.util.Vector;

// List -> ArrayList, Vector, LinkedList
public class Exam_01 {

	public static void main(String[] args) {
		Vector vc = new Vector();
		Vector vc2 = new Vector(10);
		System.out.println("기본크기 :" + vc.capacity());
		System.out.println("기본크기 :" + vc2.capacity());	//물리적인 공간
		vc.add("aaa");
		vc.add("bbb");
		System.out.println(vc.firstElement());
	}

}
