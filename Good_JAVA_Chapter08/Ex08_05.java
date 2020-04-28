package Good_JAVA_Chapter08;

public class Ex08_05 {

	public static void main(String[] args) {

		int[] aa = new int[100];
		int bb[] = new int[100];
		int i;

		for (i = 0; i < 100; i++)
			aa[i] = i * 2;
		
		for(i=0; i<100; i++)
			bb[i] = aa[99-i];
		
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨\n", bb[0], bb[99]);
	}
}
