import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	private char hak;

	public Student() {
	}

	public Student(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor+eng+mat;
		ave = Math.round(sum * 100. / 3) / 100.;
		check((int)ave);
	}

	public void check(int ave) {
		
		switch (ave/10) {
		case 10:
		case 9:
			setHak('A');
			break;
		case 8:
			setHak('B');
			break;
		case 7:
			setHak('C');
			break;
		case 6:
			setHak('D');
			break;
		default:
			setHak('F');
			break;
		}
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + ave + "\t" + hak;
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public char getHak() {
		return hak;
	}

	public void setHak(char hak) {
		this.hak = hak;
	}

	
}
