package enumEx;

public class EnumEx02 {

	public enum Item {

		Add, Del, Search, Cancel

	}

	public static void main(String[] args) {

		Item[] items = Item.values();

		for (Item n : Item.values()) {
			System.out.println(n + ":" + n.ordinal());
		}

		// values() : 열거형 객체들이 배열로 관리되는데 그것을 활용하는데 values () 메소드를
		// 통해서 확인함
		// ordinal() : 배열의 첨자가 순차적으로 하나씩 대입하면서 기억되고 있는 명칭과 실제값
		// 을 출력하여 알아보기 위해 사용함

	}

}