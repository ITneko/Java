class DD implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("NO");
		}
		try {
			Thread.sleep(500);
		}catch (Exception e) {
		}
	}
	
}
public class Exam_09 {

	public static void main(String[] args) {
		Runnable a = new DD();
		Thread t1 = new Thread(a);
		t1.start();
	}

}
