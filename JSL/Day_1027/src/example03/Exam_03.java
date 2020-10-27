package example03;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// 객체 입출력 => 객체직렬화
class Point implements Serializable{	// Serializable 은 메소드가없음
	int x;
	int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + "\ty=" + y;
	}

}

// File -> FileOutputStream -> BufferedOutputStream
// ObjectOutput -> writeObject(); 최종적으로 파일저장
// 객체직렬화가 안되있으면 java.io.NotSerializableException 가 뜸
public class Exam_03 {

	public static void main(String[] args) throws Exception {
		List<Point> list = new ArrayList<Point>(); 
		Point p1 = new Point(10,20);
		System.out.println(p1);
		
		File f = new File("/Users/uneko/data/outobject.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		list.add(p1);
		list.add(new Point(200, 300));
		list.add(new Point(20,30));
		oos.writeObject(list);
		
		oos.close();
		
	}

}
