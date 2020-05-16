package JavaM_Chapter04_Example;

public class Ex10Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static void kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if (kor[i].equals(word)) {
				System.out.println(word + "은(는)"+ eng[i]);
				return;
			}
		}
		System.out.println(word + "는 사전에 등록되지 않은 단어입니다.");
	}
}
