package example03;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//File -> FileInputStream -> BufferedInputStream
//ObjectInput -> readObject(); 최종적으로 파일저장
public class Exam_04 {

	public static void main(String[] args) {
		File f = new File("/Users/uneko/data/outobject.txt");
		
		try {
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
//		while((obj=ois.readObject())!=null) {
//			Point p = (Point)obj;
//			System.out.println(p);
//		}
		List list = (List)obj;
		System.out.println(list.get(0));
		ois.close();
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
//		}catch(ClassNotFoundException e)  {
			
		}catch(Exception e) {
			
		}
	}

}
