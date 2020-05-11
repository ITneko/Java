package Good_JAVA_Chapter12;

class Ex03Car{
	Ex03Car(){
		System.out.println("슈퍼 클래스 생성자 호출(파라미터 없음)");
	}
	
	Ex03Car(String str){
		System.out.println("슈퍼 클래스 생성자 호출 ==> " + str);
	}
}

class Ex03Sedan extends Ex03Car{
	Ex03Sedan(String str){
		super(str);
		System.out.println("서브 클래스 생성자 호출 ==> " + str);
	}
}

public class Ex12_03 {

	public static void main(String[] args) {
		Ex03Sedan sedan1 = new Ex03Sedan("여기요");
	}

}
