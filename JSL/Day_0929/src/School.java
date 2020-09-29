
public class School {
	Student student[] = new Student[10];
	private int cnt;

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void setRank() {
		int rank = 1;
		for(int x=0; x<cnt; x++) {
			student[x].setRank(rank);
		}
		
		for (int i = 0; i < cnt; i++) {
			rank = 1;
			for (int y = 0; y < cnt; y++) {
				if (student[i].getTot() < student[y].getTot()) {
					student[i].setRank(++rank);
				}
			}
		}
	}

	public void sort() {
		for (int i = 0; i < cnt - 1; i++) {
			for (int y = i + 1; y < cnt; y++) {
				if (student[i].getBun() > student[y].getBun()) {
					Student temp = student[i];
					student[i] = student[y];
					student[y] = temp;
				}
			}
		}
	}

//번호 이름 국어 영어 수학 총점 평균 석차
	public void print() {
		setRank();
		sort();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < cnt; i++) {
			System.out.print(student[i].getBun() + "\t");
			System.out.print(student[i].getName() + "\t");
			System.out.print(student[i].getKor() + "\t");
			System.out.print(student[i].getEng() + "\t");
			System.out.print(student[i].getMat() + "\t");
			System.out.print(student[i].getTot() + "\t");
			System.out.print(student[i].getAve() + "\t");
			System.out.println(student[i].getRank() + "\t");
		}
	}

	public boolean ok(int bun, String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			if (bun == student[i].getBun() && name.equals(student[i].getName())) {
				return true;
			}
		}
		return false;
	}

}
