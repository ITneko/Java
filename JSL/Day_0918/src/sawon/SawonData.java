package sawon;

// 사원 객체 저장용 최대 10명
// 필요한 계산(각종 처리)
public class SawonData {
	static Sawon sawon[] = new Sawon[10];
	static int count;

	static void print() {
		int sum = 0 , depsum=0;
		int start = 0;
		String department = sawon[0].getDepartment();
		
		System.out.println("부서명\t사번\t이름\t급여");
		System.out.println("---------------------------");
		for (int i = 0; i < count; i++) {
			if (department.equals(sawon[i].getDepartment())) {
				start = i;
				System.out.print(department+"\t");
				for (int y = start; y < count; y++) {
					if (!department.equals(sawon[y].getDepartment())) {
						department = sawon[y].getDepartment();
						break;
					}
					if (y!=start)
						System.out.print("\t");
					System.out.print(sawon[y].getBun()+"\t");
					System.out.print(sawon[y].getName()+"\t");
					System.out.println(sawon[y].getPay()+"\t");
					depsum+= sawon[y].getPay();
				}
				System.out.println("합계\t\t\t"+depsum);
				sum+=depsum;
				depsum=0;
			}
		}
		System.out.println("총합계\t\t\t" + sum);
	}

}
