package jav.interface2;

public class HakData extends Hak implements Account {

	int score2[];

	public HakData(int bun, String name, int score) {
		super(bun, name, score);
	}

	public HakData(int bun, String name, int score[]) {
		super(bun, name, 0);
		this.score2 = score;
	}

	@Override
	public void total(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.print(sum + "\t");

		System.out.println(Math.round(sum * 10. / score.length) / 10.);
	}

	@Override
	void print() {
		if (score2 == null) {
			super.print();
		} else {
			System.out.println("번호\t이름\t점수\t\t\t\t\t합계\t평균");
			System.out.print(bun + "\t" + name + "\t");

			for (int i = 0; i < score2.length; i++) {
				System.out.print(score2[i] + "\t");
			}
			total(score2);
		}

	}

}
