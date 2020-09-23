package jav.interface2;

public class HakExam {

	public static void main(String[] args) {
		Hak data = new HakData(1, "홍길동", 90);
		data.print();
		data = new HakData(1,"홍길동", new int[] {90, 80, 70, 60, 90});
		data.print();
	}

}
