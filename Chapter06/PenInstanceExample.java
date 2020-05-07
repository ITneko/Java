package Chapter06;

public class PenInstanceExample {

	public static void main(String[] args) {
		Pen testPen0 = new Pen();
		Pen testPen1 = new Pen("red");
		Pen testPen2 = new Pen(30);
		Pen testPen3 = new Pen(30, 20);
		Pen testPen4 = new Pen("yellow", 30, 20);
		Pen testPen5 = new Pen("green", 10, 1000);
		Pen[] PenArr = new Pen[6];

		PenArr[0] = testPen0;
		PenArr[1] = testPen1;
		PenArr[2] = testPen2;
		PenArr[3] = testPen3;
		PenArr[4] = testPen4;
		PenArr[5] = testPen5;

		for (Pen pen : PenArr) {
			System.out.println(" 펜의 색깔 : " + pen.color);
			System.out.println(" 펜의 길이 : " + pen.length);
			System.out.println(" 펜의 가격 : " + pen.price);
			pen.write();

		}
	}

}
