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

public class Exam_01_v2 {
	static Scanner sc = new Scanner(System.in);

	public static void add(TreeSet set) {
		
		System.out.println("번호,이름,국어,영어,수학 점수입력");
		StringTokenizer st;
		st = new StringTokenizer(sc.nextLine().trim(), " ,.-");
		int cnt = st.countTokens();
		int num[] = new int[4];
		String str[] = new String[cnt];
		
		try {
		while (st.hasMoreTokens()) {
			for (int i = 0; i < cnt; i++) {
				str[i] = st.nextToken();
			}
			for (int i = 0; i < cnt-1; i++) {
				if (i > 0) {
					num[i] = Integer.parseInt(str[i+1]);
				} else {
					num[i] = Integer.parseInt(str[i]);
				}
			}
		}
		
		boolean bool = false;
		bool = set.add(new Student(num[0], str[1], num[1], num[2], num[3]));
		if(!bool) {
			System.out.println("이미 등록된 번호입니다.");
		}
		
		}catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다.");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("잘못된 입력입니다.");
		}
		
		

	}

	public static void print(TreeSet set) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		Iterator<Student> iter = set.iterator();
		int sum[] = new int[3];
		double ave[] = new double[3];
		int cnt = 0;
		
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s);
			sum[0] += s.getKor();
			sum[1] += s.getEng();
			sum[2] += s.getMat();
			cnt++;
		}
		
		for (int i = 0; i < ave.length; i++) {
			ave[i] = Math.round(sum[i] * 100. / cnt) / 100.;
		}
		System.out.println("총점\t\t" + sum[0] + "\t" + sum[1] + "\t" + sum[2]);
		System.out.println("평균\t\t" + ave[0] + "\t" + ave[1] + "\t" + ave[2]);
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
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.exit(0);
		}
	}

	private static FileOutputStream FileOutputStream(File f) {
		return null;
	}

	public static void main(String[] args) {
		try {
			File f = new File("/Users/uneko/data/student.dat");
			Object obj = null;
			TreeSet<Student> set;
			
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
				set = (TreeSet<Student>) obj;
			} else {
				set = new TreeSet<Student>();
			}

			while (true) {
				System.out.print("(1~3)선택 :");
				int num = 0;
				try {
					num = sc.nextInt();
				} catch (InputMismatchException e) {

				}
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
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
