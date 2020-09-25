//hashCode() : 객체를 구별할 수 있는 유일한 값이(해쉬코드) 존재함.
class C{
	@Override
	public int hashCode() {
		return 100;
	}
	
}

public class Exam_05 {

	public static void main(String[] args) {
		String str1 = "AAA";
		String str2 = "BBB";
		String str3 = new String("AAA");
		System.out.println("str1 :" +str1.hashCode());
		System.out.println("str2 :" +str2.hashCode());
		System.out.println("str3 :" +str3.hashCode());
		//String 클래스의 hashCode는 오버라이딩 되어있기 때문에 가지고 있는 값이 같으면 해쉬코드가 같게 나옴
		
		C c1 = new C();
		C c2 = new C();
		System.out.println("c1 :" +c1.hashCode());
		System.out.println("c2 :" +c2.hashCode());
		
	}

}
