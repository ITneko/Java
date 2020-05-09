package JavaM_Chapter04_Example;

public class Ex02Grade {
	private int math;
	private int science;
	private int english;
	
	public Ex02Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return ((math+science+english)/3);
	}
}
