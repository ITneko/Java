import java.io.*;
public class Exam_07 {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = 
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("/Users/uneko/data/abc.txt"))));
		
		int a=dis.readInt();
		double b = dis.readDouble();
		byte by[] = new byte[10];
		dis.read(by);
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("by=" + new String(by));
	}

}
