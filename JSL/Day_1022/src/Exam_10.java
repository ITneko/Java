
public class Exam_10 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("NO");
				}try {
					Thread.sleep(500);
				}catch (Exception e) {
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("YES");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			}
		}
	}
}
