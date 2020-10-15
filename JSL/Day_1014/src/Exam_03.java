import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		List<Member> mList = new ArrayList<Member>();
		mList.add(new Member(1, "AAA", 28));
		Member m = new Member(2, "BBB" , 30);
		for(int i=0; i<mList.size(); i++) {
			Member m2 = mList.get(i);
			System.out.println(m2.getIdx());
			System.out.println(m2.getName());
			System.out.println(m.getAge());
		}
		
	}

}

class Member{
	private int idx;
	private int age;
	private String name;
	
	public Member() {
	}
	
	public Member(int idx, String name, int age) {
		this.idx = idx;
		this.age = age;
		this.name = name;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}