package student;

public class Student {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int hwa;
	private int dat;
	private int sum;
	private double ave;
	private int rank;
	
	public Student() {
	}
	
	public Student(int bun, String name, int kor, int eng, int mat, int hwa, int dat, int sum, double ave){
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.hwa = hwa;
		this.dat = dat;
		this.sum = sum;
		this.ave = ave;
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

	public int getHwa() {
		return hwa;
	}

	public void setHwa(int hwa) {
		this.hwa = hwa;
	}

	public int getDat() {
		return dat;
	}

	public void setDat(int dat) {
		this.dat = dat;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
