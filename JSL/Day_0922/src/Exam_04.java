abstract class Student{
	int bun;
	String name;
	int score[];
	int tot;
	double ave;
	public Student(int bun,String name, int[] score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);
	}
	
	public abstract void account();	//총점 평균 계산
	public abstract void scoreMax();	// 최소점수: xxx,  최대점수: xxx
	public abstract void scoreSelectionSort();	// 점수(오름차순) : xx xx xx xx ...
	public abstract void scoreBubbleSort();	// 점수(내림차순) : xx xx xx xx ...
	
}

class StudentExam extends Student{
	
	StudentExam(int bun, String name, int[] score){
		super(bun,name,score);
	}

	@Override
	public void account() {
		tot=0;
		for(int i = 0; i<score.length; i++) {
			tot+=score[i];
		}
		
		ave = Math.round(tot*100./score.length)/100.;
	}

	@Override
	public void scoreMax() {
		int min=100;
		int max=0;
		for(int i=0; i<score.length; i++) {
			if(score[i]<min)
				min = score[i];
			if(score[i]>max)
				max = score[i];
		}
		
		System.out.println("\n최소점수: "+ min+"\t"+"최대점수: " +max);
	}

	@Override
	public void scoreSelectionSort() {
		for(int i =0; i<score.length; i++) {
			for(int y=i+1; y<score.length; y++) {
				if(score[i]>score[y]) {
					int temp = score[i];
					score[i] = score[y];
					score[y] = temp;
				}
			}
		}
		System.out.print("점수(오름차순): ");
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
	}

	@Override
	public void scoreBubbleSort() {
		for(int i=0; i<score.length; i++) {
			for(int y=0; y<score.length-i-1; y++) {
				if(score[y]<score[y+1]) {
					int temp = score[y];
					score[y] = score[y+1];
					score[y+1] = temp;
				}
			}
		}
		System.out.print("점수(내림차순): ");
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
	}
	
}


public class Exam_04 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "Java";
		int score[] = {90, 66, 78, 89, 45, 67,79,94,88,67,90,78};
		StudentExam stu = new StudentExam(bun,name,score);
		stu.account();
		stu.print();
		stu.scoreMax();
		stu.scoreSelectionSort();
		stu.scoreBubbleSort();
	}

}


//49 52 33 90 46