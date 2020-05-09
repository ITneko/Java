package Good_JAVA_Chapter10;

/*
 * System.in.read()사용 예
 * System.in.read()는 바이트 단위로 입력받음 (ASCII)
 * System.in.read()메소드는 try~catch 문으로 묶여야 한다
 * 
 * Character.toString(char c)  char형 값을 스트링으로 변환시켜준다
 * 
 * Enter(ASCII 13)를 누를 때까지 키를 입력받고 입력한 결과가 "Neko"면 통과하는 프로그램
 */
import java.io.IOException;

public class Ex10_08 {

	public static void main(String[] args) {

		String userName = "Neko";
		String input = "";
		int key;
		
		try {
			System.out.print("이름 ==> ");
			while((key = System.in.read()) !=13) {
				input += Character.toString((char)key);
			}
			if(userName.equals(input))
				System.out.print(input + "님 환영합니다.");
			else
				System.out.print(input + "님은 등록되지 않은 상태입니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
