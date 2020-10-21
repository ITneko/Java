package test01;

import java.util.*;
import java.util.Map.Entry;

/*	키보드로 번호, 이름, 점수를 입력받아서 학생객체(번호, 이름)를 생성 TreeMap 저장 후 출력
 *	[1. 입력형식]
 *	입력 : 1,홍길동,95
 *	입력 : 7,김자바,88
 *	.	.	.	.	.
 *	입력 : 0 -> 출력 후 종료
 *
 *	[2. 처리조건]
 *	- 동일번호 입력 시 "이미 등록된 번호입니다." 경고 출력
 *
 *	[3. 출력 형식(번호 순으로 출력) ]
 *	번호	이름	점수
 *	.	.	.	
 *	.	.	.
 *	총점 	xxx
 *	평균	xx.xx
 * 
 */
public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Student, Integer> map = new TreeMap<Student, Integer>();
		boolean bool = false;
		while (true) {
			System.out.print("입력 : ");
			String str[] = sc.nextLine().split(",");
			if (str[0].equals("0"))
				break;
			int num = Integer.parseInt(str[0]);
			String name = str[1];
			int score = Integer.parseInt(str[2]);

			if (bool) {
				Student key = new Student(num, name);
				bool = map.containsKey(key);
				if (bool) {
					System.out.println("이미 등록된 번호입니다.");
					continue;
				}
				
			} 
			map.put(new Student(num, name), score);
			bool = true;

		}
		System.out.println("번호\t이름\t점수");
		Set<Student> set = map.keySet();
		Iterator iter = set.iterator();
		int sum=0;
		while (iter.hasNext()) {
			Student key = (Student) iter.next();
			sum += map.get(key);
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (Math.round(sum*100./set.size())/100.));
		
	}

}

/*
1,일길동,60
6,육길동,66
7,칠길동,90
5,오길동,50
9,구길동,99
 */
