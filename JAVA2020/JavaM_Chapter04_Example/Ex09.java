package JavaM_Chapter04_Example;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
		
	}

	public static void print(int[] a) {
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.print("]");
	}

}

public class Ex09 {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
