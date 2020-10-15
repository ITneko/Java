package test01;

import java.util.*;


/* 키보드로 사원id, 이름, 나이를 입력받아서 사원 객체를 생성 set에 저장 후 출력
 * 1. 입력형식
 * 사원등록 : aaa,김사원,30
 * .	.	.	.	.
 * 2. 출력 형식
 * 아이디	이름	나이
 *  .	.	.	
 * 3. 처리조건
 * - 동일한 사원(id)일 경우 "중복된 아이디입니다." 출력 후 재입력
 * - 사원아이디가 end(대소문자구분없음) 이면 전체사원 출력 후 종료
 * 
 */

class Sawon{
	private String id;
	private String name;
	private int age;
	
	public Sawon() {
	}
	
	public Sawon(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return id+"\t"+name+"\t"+age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon s = (Sawon)obj;
			return s.id.equals(id);
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return id.hashCode();
	}
	
}


public class Exam_07 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Set<Sawon> set = new HashSet<Sawon>();
		boolean bool = false;
		
		while(true) {
			System.out.print("입력 :");
			String str[] = sc.nextLine().split(",");
			if(str[0].toUpperCase().equals("END"))
				break;
			
			bool = set.add(new Sawon(str[0], str[1], Integer.parseInt(str[2])));
			if(!bool) {
				System.out.println("중복된 id입니다.");
			}
		}
		System.out.println("아이디\t이름\t나이");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
