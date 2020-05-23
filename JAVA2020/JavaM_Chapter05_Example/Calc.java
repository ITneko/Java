package JavaM_Chapter05_Example;

abstract class Calc {
	protected int a;
	protected int b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}
