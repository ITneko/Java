package Java20_04_14;
// ( 조건식 ? 연산식1 : 연산식2 )	조건식이 참이면 연산식1, 거짓이면 연산식2의 결과
public class ConditionalExample {

	public static void main(String[] args) {

		int a = 5 - (int)(Math.random()*10);
		if(args.length > 0) {
			a = Integer.parseInt(args[0]);
		}
		
		int abs = (a >= 0) ? a : -a;
		System.out.println(a + "의 절대값은 : " + abs);
		
	}

}
