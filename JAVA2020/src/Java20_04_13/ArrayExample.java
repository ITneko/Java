package Java20_04_13;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[] = new int[8];
		int arr2[] = {1,2,3,4,5};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.arraycopy(arr2, 0, arr, 0, arr2.length);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
