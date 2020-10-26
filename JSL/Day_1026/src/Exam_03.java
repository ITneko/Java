import java.io.*;

public class Exam_03 {

	public static void main(String[] args) {
		File f = new File("/Users/uneko/data/");
		
		File[] fl = f.listFiles();
		String[] fList = f.list();
		for(int i=0; i<fList.length; i++) {
			System.out.println(fList[i]);
		}
		for(int i=0; i<fList.length; i++) {
			if(fl[i].isFile()) {
				System.out.println("파일 : " + fl[i].getName());
			}
		}
	}

}
