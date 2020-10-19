import java.util.*;
public class Exam_02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry e = (Map.Entry)iter.next();
			System.out.println("이름 : "+ e.getKey() + ",  점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		iter = values.iterator();
		
		int total = 0;
		while(iter.hasNext()) {
			Integer i = (Integer)iter.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
