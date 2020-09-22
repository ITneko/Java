abstract class DD {
	int m, n;

	public DD(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public void print() {
		System.out.println("m=" + m + "\tn=" + n);
	}

	public abstract int add();

	public abstract void mul();
}

class DDD extends DD {

	public DDD(int m, int n) {
		super(m, n);
	}

	public int add() {
		int sum=0;
		for(int x=m; x<=n; x++) {
			sum+=x;
		}
		return sum;
	}

	public void mul() {
		int sum=1;
		for(int x=m; x<=n; x++) {
			sum*=x;
		}
		System.out.println(sum);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		DDD dd = new DDD(1, 5);
		// m=1, n=5
		int s = dd.add();
		System.out.println("s =" + s); // 15
		dd.mul(); // 120
	}

}
