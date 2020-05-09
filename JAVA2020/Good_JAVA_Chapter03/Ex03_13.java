package Good_JAVA_Chapter03;

public class Ex03_13 {

	public static void main(String[] args) {
		int a,b;
		char c,d;
		
		a = 0xF90A;
		b = 0x50;
		System.out.printf("%c \n",a);
		
		c = (char)b;
		System.out.printf("%c \n", c);
		
		d = '#';
		System.out.printf("%c의 ASCII값은 %d입니다 \n", d,(int)d);

	}

}
