package final_;

class MyDate {
	int year = 2000;
	int month = 1;
	int day = 1;
	public String toString() {
		return "[" + year + "-" + month + "-" + day + "]";
	}
	public void doIt(final int a) {
//		a++;	//error
	}
}

public class FinalRefVarExample {
	static final MyDate date = new MyDate();
	
	public static void main(String[] args) {
//		date = new MyDate(); //error
		date.year = 2012;
		System.out.println(date.toString());
	}

}
