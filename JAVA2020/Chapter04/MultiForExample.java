package Chapter04;

public class MultiForExample {

	public static void main(String[] args) {

		for(int i=1; i<10; i++ ) {
			for(int j=2; j<10; j++){
				System.out.printf("%d*%d=%2d\t",j,i,j*i);
			}System.out.println();
				
		}
	}

}
