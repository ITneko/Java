import java.io.*;
import java.util.*;

/*	키보드로 이름, 국어,영어,수학 점수를 입력받아서 학생객체(Student)를 파일(Student.dat)로 저장하는 프로그램 작성
 * 
 * 	[메인화면구성]
 * 	[1] 학생등록
 * 	[2] 학생출력
 * 	[3] 종료
 * 
 * 	[1. 입력 형식]
 * 	입력: 1,홍길동,95,87,95
 * 	입력: 7,김자바,88,99,89
 * 
 * 	입력: 0 -> 출력 후 종
 * 
 * 	[2. 처리조건]
 * 	- 동일번호 입력 시 "이미 등록된 번호입니다" 경고 출력
 * 
 * 	[3. 출력 형식 (번호순으로 출력)
 * 	번호	이름	국어	영어	수학	총점	평균	학점
 * 	.	.	.	.	.	.	.	.
 * 	총점	xx	xx	xx	xx
 *	평균	xx	xx	xx	xx
 *
 *	평균은 소수 이하 둘째자리 까지 출력
 *	학점은 평균 90이상 A, 80이상 B,	70이상 C, 60이상 D, 60미만 F
 * 	.	.	.
 * 	
 */
public class Exam_01 {
	static Scanner sc = new Scanner(System.in);

	public static void add(TreeSet set) {
		System.out.print("학생정보 입력 :");
		String str[] = sc.nextLine().trim().split(",");
		int bun = Integer.parseInt(str[0]);
		String name = str[1];
		int kor = Integer.parseInt(str[2]);
		int eng = Integer.parseInt(str[3]);
		int mat = Integer.parseInt(str[4]);
		int sum = kor + eng + mat;
		boolean bool = false;
		bool = set.add(new Student(bun, name, kor, eng, mat));
		if (!bool) {
			System.out.println("이미 등록된 번호입니다!");
		}
	}

	public static void print(TreeSet set) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t");
		Iterator iter = set.iterator();
		int kor = 0;
		int eng = 0;
		int mat = 0;

		int cnt = 0;
		while (iter.hasNext()) {
			Student s = (Student) iter.next();
			System.out.println(s);
			kor += s.getKor();
			eng += s.getEng();
			mat += s.getMat();
			cnt++;
		}
		double korAve = Math.round(kor * 100. / cnt) / 100.;
		double engAve = Math.round(eng * 100. / cnt) / 100.;
		double matAve = Math.round(mat * 100. / cnt) / 100.;
		System.out.println("총점\t\t" + kor + "\t" + eng + "\t" + mat);
		System.out.println("평균\t\t" + korAve + "\t" + engAve + "\t" + matAve);
	}

	public static void exit(TreeSet set) {
		try {
			File f = new File("/Users/uneko/data/student.dat");
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(set);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("저장이 완료되었습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		try {
			File f = new File("/Users/uneko/data/student.dat");
			Object obj = null;
			TreeSet<Student> set = null;
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int ok = bis.available();
			if (ok != 0) {
				ObjectInputStream ois = new ObjectInputStream(bis);
				obj = ois.readObject();
				set = (TreeSet) obj;

			} else {
				set = new TreeSet<Student>();
			}

			while (true) {
				System.out.print("작업선택(1~3) :");
				int num = sc.nextInt();
				sc.nextLine();

				switch (num) {
				case 1:
					add(set);
					break;
				case 2:
					print(set);
					break;
				case 3:
					exit(set);
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}

			}
		} catch (

		EOFException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
