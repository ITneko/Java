package JavaM_Chapter05_Example;

public class Dictionary extends PairMap {
	
	public Dictionary(int size) {
		this.keyArray = new String[size];
		this.valueArray = new String[size];
	}

	@Override // key값을 가진 value 리턴, 없으면 null 리턴
	String get(String key) {
		for(int i = 0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}

	@Override // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] == null && valueArray[i] == null) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			} else if (keyArray[i] == key) {
				valueArray[i] = value;
				return;
			}
		}
	}

	@Override // key값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
	String delete(String key) {
		for(int i = 0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key)) {
				String str = valueArray[i];
				valueArray[i] = null;
				return str;
			}
		}
		return null;
	}

	@Override // 현재 저장된 아이템의 개수 리턴
	int length() {
		int j=0;
		for(int i = 0; i<valueArray.length; i++) {
			if(valueArray[i] != null)
				j++;
		}
		return j;
	}

}
