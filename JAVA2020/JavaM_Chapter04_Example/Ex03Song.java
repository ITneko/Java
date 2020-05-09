package JavaM_Chapter04_Example;

public class Ex03Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Ex03Song(){
		this.title = "Unknown";
		this.artist = "Unknown";
		this.year = 1900;
		this.country = "Unknown";
	}
	
	public Ex03Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
