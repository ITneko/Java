class F {
	int a = 10;

	void print() {
	}
}

class FF extends F {
	int b = 20;

	@Override
	void print() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}

class FFF extends FF {
	int c = 30;

	@Override
	void print() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

}

public class Exam_06 {

	public static void main(String[] args) {
		F f = new F();
		f.print();
		
		F ff = new FF();	//업캐스팅
		ff.print();
		
		F fff = new FFF();
		fff.print();
		
//		FF f1 = new FF;
		FF f2 = (FF)ff;	//다운캐스팅
//		FFF f3 = (FFF)new FF(); //런타임 오류
	}

}
