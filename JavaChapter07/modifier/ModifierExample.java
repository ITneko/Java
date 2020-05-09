package modifier;

import modifier.pac.Super;

public class ModifierExample {

	public static void main(String[] args) {

		System.out.println("***** Super 참조 *****");
		Super sup = new Super();
		System.out.println("num1 = " + sup.num1 +
//				"\tnum2 = " + sup.num2 +
//				"\tnum3 = " + sup.num3 +
				"\tnum4 = " + sup.getNum4());
		
		System.out.println("\n***** Sub 참조 *****");
		Sub sub = new Sub();
		sub.print();
		
	}

}
