package final_;
//final 멤버변수는 선언시(a), 초기화자(b), 또는 기본생성자(c) 중 하나에서 반드시 초기화 해야함
//기본생성자가 아닌 생성자에서 파라미터를 통한 초기화는 안 됨
public class FinalInitExample {

	public static void main(String[] args) {
		FinalInit f = new FinalInit(30);
	}

}

class FinalInit {
	final int a = 10;	//a
	{
//		a = 10;			//b
	}
	FinalInit(){		//c
//		a = 10;
	}
	FinalInit(int a){
//		this.a = a;	//이것은 final 필드의 초기화가 아님
	}
}
