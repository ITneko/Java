package JavaM_Chapter05_Example;

public class Add extends Calc{
	
	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		return a+b;
	}
	
}
