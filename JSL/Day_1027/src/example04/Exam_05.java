package example04;

import java.io.*;
import java.util.*;

/*	키보드로 이름, 전화, 나이를 입력받아서 Person 객체를 생성, 파일로 출력하는 프로그램
 * 	[입력 형식]
 * 	[1] 등록
 * 	[2] 전체보기(화면출력)
 * 	[3] 종료
 * 	메뉴선택 [1~3]
 * 
 * 	[1] 선택시
 * 	등록 : 홍길동,010-1111-2222, 28
 * 
 * 	[2] 선택시
 * 	이름	전화	나이
 * 	.	.	.
 * 	
 */
public class Exam_05 {
	static Scanner sc = new Scanner(System.in);

	public static void add(List list) {
		System.out.print("등록: ");
		String str[] = sc.nextLine().split(",");
		list.add(new Person(str[0], str[1], Integer.parseInt(str[2].trim())));
	}

	public static void print(List list) {
		System.out.println("이름\t전화\t나이");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	

	public static void exit(List list) {
		try {
			File f = new File("/Users/uneko/data/student.dat");
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream obs = new ObjectOutputStream(bos);
			obs.writeObject(list);
			obs.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		} finally {
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		try {
			File f = new File("/Users/uneko/data/student.dat");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			Object obj = ois.readObject();
			List list = (List) obj;

			while (true) {
				System.out.print("1.등록, 2.전체보기, 3.종료 :");
				int select = sc.nextInt();
				sc.nextLine();

				switch (select) {
				case 1:
					add(list);
					break;
				case 2:
					print(list);
					break;
				case 3:
					exit(list);
					break;
					default:
						System.out.println("잘못된 값입니다.");
						break;
				}

			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		}

	}

}
