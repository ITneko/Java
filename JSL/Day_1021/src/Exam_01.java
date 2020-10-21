import java.util.Map;
import java.util.TreeMap;

public class Exam_01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		score.put(100, "AAA");
		score.put(70, "BBB");
		score.put(60, "CCC");
		score.put(30, "DDD");
		score.put(50, "SSS");
		score.put(85, "FFF");

		System.out.println(score);
		Map.Entry<Integer, String> entry = null;

		entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(80);
		System.out.println("80점 바로 위 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.floorEntry(65);
		System.out.println("65점 이거나 바로 아래 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(65);
		System.out.println("65점 이거나 바로 위 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lowerEntry(80);
		System.out.println("80점 아래의 수 : " + entry.getKey() + "-" + entry.getValue());
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.print(entry.getKey() +"\t");
			System.out.println("남은 객체 수 : " + score.size());
		}
	}

}
