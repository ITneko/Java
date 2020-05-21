package CollectionFramework_;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map maps = new HashMap();

		String s1 = new String("홍길동");
		maps.put("name", s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);

		System.out.println(maps);

		System.out.println();
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));

		System.out.println();
		// map안의 엘리먼트를 entrySet() 메서드를 이용하여 조회
		Set<Map.Entry<String, Object>> s = maps.entrySet();
		for (Map.Entry<String, Object> me : s) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}

		System.out.println();
		// keySet() 메서드로 map키를 리턴받고 get(key) 메서드로 조회
		Set<String> ss = maps.keySet();
		for (String key : ss) {
			System.out.println(key + " :: " + maps.get(key));
		}

		System.out.println("* values 를 이용한value  출력 ");
		Collection valueList = maps.values();
		Iterator iter = valueList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
