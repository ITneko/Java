class ExamThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("NO");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
	
}

class ExamThread2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("YES");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
	
}
public class Exam_07 {

	public static void main(String[] args) {
		Thread th1 = new ExamThread();
		Thread th2 = new ExamThread2();
		
		th1.start();
		th2.start();
	}

}
