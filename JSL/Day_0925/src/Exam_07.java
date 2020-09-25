//finalize() : 객체 소멸자
class D{
	private int no;
	
	public D(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"번 객체가 소멸됩니다.");
	}
	
}

public class Exam_07 {

	public static void main(String[] args) {
		D d1 = null;
		for(int x= 0; x<50; x++) {
			d1 = new D(x);
			d1 = null;
			System.gc(); //안쓰는 객체들을 좀더 빨리 제거해달라고 요청
		}
	}

}
