import java.util.*;

/*
 * 입력 : id, name, age (user01, 홍길동, 20)
 * 
 * 출력
 * 아이디		이름		나이
 * user01	홍길동	20
 * "		"		"
 * 처리조건
 * 1. id 중복시 "중복된 id 입니다." 경고출력
 * 2. id가 end 이면 전체 자료를 출력하고 종료
 */

public class Exam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Mem> list = new ArrayList<Mem>();
		int sw = 0;

		while (true) {
			System.out.print("입력: ");
			String str[] = sc.nextLine().split(",");
			if(str[0].toUpperCase().equals("END")) 
				break;
			
			String id = str[0];
			String name = str[1];
			int age = Integer.parseInt(str[2]);
			
			if(sw==1) {
				for(int i=0; i<list.size(); i++) {
					if(id.contains(list.get(i).getId())) {
						System.out.println("중복된 id 입니다.");
						sw=0;
					}
				}if(sw==0)
					continue;
			}
			list.add(new Mem(id,name,age));
			sw=1;
		}
		System.out.println("아이디\t이름\t나이");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}

class Mem {
	private String id;
	private String name;
	private int age;

	Mem() {
	}

	Mem(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mem) {
			Mem m = (Mem)obj;
			return m.id.equals(id);
		}else {
			return false;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}