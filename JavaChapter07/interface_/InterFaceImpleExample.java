package interface_;

public class InterFaceImpleExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo; // 다형성이 적용됨
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
		//itodo3.m4(); //Error - IToDo3 에는 m4()가 없음
		IToDo4 itodo4 = todo;
		itodo4.m4();
	}

}
