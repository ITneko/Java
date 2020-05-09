package JavaM_Chapter04_Example;

public class Ex01TV {
	private String name;
	private int year;
	private int inch;
	
	public Ex01TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	
}
