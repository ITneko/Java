package JavaM_Chapter05_Example;

public class IPTV extends ColorTV{
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	
	public String getIP() {
		return ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + this.getIP() + "주소의 " + this.getSize() + "인치 " + this.getColor() +"컬러");
	}
}
