package JavaM_Chapter05_Example;

public class Won2Dollar extends Converter{	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	public double convert(double src) {
		return src/ratio;
	}
	
	public String getSrcString() {
		return "원";
	}
	
	public String getDestString() {
		return "달러";
	}
	
}
