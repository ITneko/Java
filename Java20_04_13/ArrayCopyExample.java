package Java20_04_13;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] arr2 = new int[12];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		
		System.arraycopy(arr, 1, arr2, 2, 8);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		

	}

}
