import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList();
		sList.add("Java");
		sList.add("is");
		sList.add("good");
		sList.add("!");

		System.out.println("원본 :\t" + sList);
		sList.set(2, "bad");
		System.out.println("set :\t" + sList);
		
		int index = sList.indexOf("Java");
		sList.set(index, "C++");
		
		int index2 = sList.indexOf("!");
		sList.set(index2, "?");
		System.out.println("Index :\t"+sList);
		
		sList.add("No");
		sList.add("No");
		sList.add("No");
		sList.add("No");
		System.out.println("add :\t"+sList);
		
		for(int i=0; i<sList.size(); i++) {
			if(sList.get(i).contains("No")) {
				sList.set(i, "Yes");
			}
		}
		System.out.println("contains : "+sList);
	}

}
