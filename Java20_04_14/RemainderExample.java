package Java20_04_14;

public class RemainderExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println(3.5 % 0.3);	//권장 하지 않음
	}

}
