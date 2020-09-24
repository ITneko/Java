interface Vehicle {
	public void run();
}

class Anonymouse {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}

	};

	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}

		};

		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}

/*
 * 자전거가 달립니다. 
 * 승용차가 달립니다. 
 * 트럭이 달립니다.
 */

public class Exam_06 {

	public static void main(String[] args) {
		Anonymouse anory = new Anonymouse();
		anory.field.run();
		anory.method1();
		anory.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}

}
