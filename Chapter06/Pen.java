package Chapter06;

public class Pen {

	public String color;
	public int length;
	public int price;

	public Pen() {
		System.out.println(" 기본생성자실행됨 ");
	}

	public Pen(String color) {
		System.out.println("color 를 인자로 하는 생성자 실행됨 ");
		this.color = color;
	}

	public Pen(int length) {
		System.out.println("length 를 인자로 하는 생성자 실행됨 ");
		this.length = length;
	}

	public Pen(int length, int price) {
		System.out.println("penLength,penPrice 를 인자로하는 생성자 실행됨 ");
		this.length = length;
		this.price = price;
	}
	
	//==============================================
	//Source - Generate Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//==============================================

	public Pen(String color, int length, int price) {
	this.color = color;
	this.length = length;
	this.price = price;
	System.out.println("penColor,penLength,penPrice 를 인자로하는 생성자 실행됨 ");
	}

	public void write() {
	System.out.println("잘 써져요");
	}

	
}
