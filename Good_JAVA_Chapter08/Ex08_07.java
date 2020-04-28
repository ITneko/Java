package Good_JAVA_Chapter08;

public class Ex08_07 {

	public static void main(String[] args) {

		int[][] aa = new int[3][4];

		aa[0][0] = 1;
		aa[0][1] = 2;
		aa[0][2] = 3;
		aa[0][3] = 4;

		aa[1][0] = 5;
		aa[1][1] = 6;
		aa[1][2] = 7;
		aa[1][3] = 8;
		
		aa[2][0] = 9;
		aa[2][1] = 10;
		aa[2][2] = 11;
		aa[2][3] = 12;
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
		System.out.printf("%3d %3d %3d %3d\n", aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
	}

}
