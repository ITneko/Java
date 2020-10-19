package test;

import java.util.*;

class Student {
	private int num;
	private String name;

	public Student() {
	}

	public Student(int num, String name) {
		this.name = name;
		this.num = num;
	}

	@Override
	public int hashCode() {
		return name.hashCode()+num;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.num==num && s.name.equals(name);
		}else
			return false;
	}
	
	

}

public class Exam_02 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 100);
		map.put(new Student(5, "일길동"), 90);
		map.put(new Student(3, "이길동"), 80);
		map.put(new Student(2, "삼길동"), 70);
		map.put(new Student(4, "사길동"), 60);
		map.put(new Student(6, "오길동"), 50);
		map.put(new Student(8, "육길동"), 40);
		map.put(new Student(7, "칠길동"), 30);

		//System.out.println(map.size());

		// 1. 키보드로 번호, 이름을 입력 Student 객체를 생성
		// Map에 저장된 객체를 찾아서 출력.
		// 찾는 객체가 없을 경우 " 등록된 자료 없음" 출력

		// 2. 점수 합계를 구하여 출력

		// 3. 점수의 최대값, 최소값을 찾아서 출력
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름과 번호 입력: ");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("0")) break;
			int num = Integer.parseInt(str[0]);
			String name = str[1];
			Student temp = new Student(num,name);
			if(!(map.containsKey(temp))){
				System.out.println("등록된 자료 없음");
			}else {
				System.out.println("점수 : " + map.get(temp));
			}
		}
		
		int sum=0;
		Collection values = map.values();
		Iterator iter = values.iterator();
		while(iter.hasNext()) {
			Integer i = (Integer)iter.next();
			sum += i.intValue();
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("최대값 : " + Collections.max(values));
		System.out.println("최소값 : " + Collections.min(values));
	}

}
