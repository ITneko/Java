package Chapter04;

//continue [label]
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue; // 여기서 다시 for문으로 넘어가기 때문에 5는 제외되고 출력된다.
			}
			System.out.print(i + "\t");
		}
	}

}
