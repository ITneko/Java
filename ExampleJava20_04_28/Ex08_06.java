package ExampleJava20_04_28;

public class Ex08_06 {

	public static void main(String[] args) {

		int aa[] = {10, 20, 30 ,40, 50};
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;	//배열의 전체 크기(바이트)를 계산한다.
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.\n", count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트 입니다.\n", size);
	}

}
