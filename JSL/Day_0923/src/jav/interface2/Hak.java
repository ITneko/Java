package jav.interface2;

public class Hak {
	int bun;
	String name;
	int score;
	
	public Hak(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	void print() {
		System.out.println("번호\t이름\t점수\t");
		System.out.println(bun+"\t" + name +"\t"+ score);
	}
}
