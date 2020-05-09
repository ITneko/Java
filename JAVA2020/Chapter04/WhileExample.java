package Chapter04;

public class WhileExample {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		while (i <=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("합은 : " + sum);
	}

}
