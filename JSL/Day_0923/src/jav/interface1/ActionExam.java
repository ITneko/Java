package jav.interface1;

public class ActionExam {

	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를합니다.");
			}
			
		};
		
		action.work();
	}

}