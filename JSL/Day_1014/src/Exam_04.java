import java.util.*;


public class Exam_04 {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList();
		
		sList.add(new Student(1,"aaa",80));
		sList.add(new Student(5,"eee",30));
		sList.add(new Student(3,"ccc",60));
		sList.add(new Student(6,"fff",80));
		sList.add(new Student(2,"bbb",70));
		sList.add(new Student(4,"ddd",90));
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		for (int i = 0; i < sList.size(); i++) {
			int cnt =0;
			for (int j = 0; j < sList.size()-1; j++) {
				if(sList.get(j).getBun()>sList.get(j+1).getBun()) {
					Student s = new Student();
					s = sList.get(j);
					sList.set(j, sList.get(j+1));
					sList.set(j+1, s);
					cnt = 1;
				}
			}	
			if(cnt == 0) {
				break;
			}
		}
		
		System.out.println("\n======= SORT ========\n");
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
	}
}


class Student{
	private int bun;
	private String name;
	private int score;
	
	Student(){
		
	}
	
	public Student(int bun, String name, int score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+score;
	}
	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}

