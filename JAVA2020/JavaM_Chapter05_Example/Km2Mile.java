package JavaM_Chapter05_Example;

public class Km2Mile extends Converter {
	public Km2Mile (double ratio) {
		this.ratio = ratio;
	}
	
	public double convert(double src) {
		return src/ratio;
	}
	
	public String getSrcString() {
		return "Km";
	}
	
	public String getDestString() {
		return "mile";
	}
}
