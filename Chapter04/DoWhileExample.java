package Chapter04;

public class DoWhileExample {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		do {
			sum = sum+i;
			i++;
		}while(i<=10);
		
		System.out.println("합은: " + sum);
	}

}
