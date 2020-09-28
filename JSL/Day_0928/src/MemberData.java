
public class MemberData {
	Member member[] = new Member[10];
	int cnt;

	public void print() {
		System.out.println("이름\t전화\t\t성별\t나이");
		for (int i = 0; i < cnt; i++) {
			System.out.print(member[i].getName() + "\t");
			System.out.print(member[i].getTel() + "\t");
			System.out.print(member[i].getGender() + "\t");
			System.out.println(member[i].getAge());
		}
	}

}
