import java.io.IOException;

// 예외처리(Exception), Error
public class Exam_07 {

	public static void main(String[] args) {
		System.out.println("1문자 입력 : ");
		try {	// 예외가 발생할 수 있는 코드
			int a = System.in.read();
		}catch(IOException e) {	//예외가 발생을 받는 부분
			e.printStackTrace();
		}catch(Exception ee) {	//최상위 Exception은 제일 나중에.
			ee.printStackTrace();
		}finally {
			System.out.println("예외가 발생했습니다.");
		}
	}

}
