package Java20_04_13;

public class PrimitiveArrayReferenceArray {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int[] arr2 = {100,200,300,400,500};
		
		Cat[] catArr = new Cat[5];
		catArr[0] = new Cat(3, "나비");
		Cat c2 = new Cat(2,"너비");
		Cat c3 = new Cat(3,"누비");
		Cat c4 = new Cat(4,"노비");
		Cat c5 = new Cat(10,"호랑나비");
		catArr[1] = c2;
		catArr[2] = c3;
		catArr[3] = c4;
		catArr[4] = c5;
		
		System.out.println(catArr[1]);
		System.out.println(arr[0]);
		
	}

}
