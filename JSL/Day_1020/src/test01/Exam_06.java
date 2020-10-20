package test01;

import java.util.*;

/*	키보드로 번호, 이름, 점수를 입력받아서 학생객체를 생성. TreeSet 저장 후 출력
 * 	입력 : 1,홍길동,95
 * 	입력 : 7,김자바,88
 * 	.	.	.	.
 * 	입력 : 0	-> 출력 후 종료
 * 	동일한 번호 입력 시 "이미 등록된 번호입니다." 경고 출력
 * 	출력(번호순으로 출력)
 * 	번호	이름	점수
 * 	.	.	.
 * 	총점		XXX
 * 	평균		XXX.XX
 * 	최대점수 학생
 * 	번호: xx	이름: xxx		점수 : xxx
 * 	최소점수 학생
 * 	번호: xx	이름: xxx		점수 : xxx
 */

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> sSet = new TreeSet<Student>();
		boolean bool = false;
		while(true) {
			System.out.print("번호,이름,점수 입력: ");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("0")) break;
			int num = Integer.parseInt(str[0]);
			String name = str[1];
			int score = Integer.parseInt(str[2]);
			bool = sSet.add(new Student(num, name, score));
			if(!bool) {
				System.out.println("이미 등록된 번호입니다.");
			}
		}
		System.out.println("번호\t이름\t점수");
		Set set = sSet;
		Iterator iter = set.iterator();
		int size = set.size();
		int sum = 0;
		Student sst = sSet.last();
		Student bst = sSet.first();
		
		while(iter.hasNext()) {
			Student st = (Student)iter.next();
			sum += st.getScore();
			if(sst.getScore() > st.getScore()) 
				sst = st;
			if(bst.getScore() < st.getScore())
				bst = st;
			
			System.out.println(st);
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (Math.round(sum*100./size)/100.));
		System.out.println("\n최대 점수 학생");
		System.out.println("번호 : " + bst.getNum() + "\t이름 : " + bst.getName() + "\t점수 : " + bst.getScore());
		System.out.println("\n최소 점수 학생");
		System.out.println("번호 : " + sst.getNum() + "\t이름 : " + sst.getName() + "\t점수 : " + sst.getScore());
	}

}
/*
1,일길동,60
6,육길동,66
7,칠길동,90
5,오길동,50
9,구길동,99
*/
