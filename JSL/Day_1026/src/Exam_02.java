import java.io.File;
public class Exam_02 {

	public static void main(String[] args) {
		File f1 = new File("/Users/uneko/data/abc.txt");
		if(f1.exists()) {
			f1.deleteOnExit();
			System.out.println("파일명 : " + f1.getName());
			System.out.println("파일경로 : " + f1.getPath());
			System.out.println("부모파일경로 : " + f1.getParent());
			System.out.println("파일크기 : " + f1.length() + "KB");
			System.out.println("최종수정일 : " + f1.lastModified());
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
