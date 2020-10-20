package test01;

public class Student implements Comparable<Student>{
	private int num;
	private String name;
	private int score;
	
	public Student() {
	}
	public Student(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(num, o.num);
	}
	
	@Override
	public String toString() {
		return num+"\t"+name+"\t"+score;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
