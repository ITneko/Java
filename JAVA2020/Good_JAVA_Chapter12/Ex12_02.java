package Good_JAVA_Chapter12;

class Ex02Car {
	Ex02Car() {
		System.out.println("슈퍼 클래스 생성자 호출");
	}
}

class Ex02Sedan extends Ex02Car {
	Ex02Sedan() {
		System.out.println("서브 클래스 생성자 호출");
	}
}

public class Ex12_02 {
	
	public static void main(String[] args) {
		Ex02Sedan sedan1 = new Ex02Sedan();
	}
	
}
