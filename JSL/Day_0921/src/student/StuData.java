package student;
// 1 이학생 28 90 89 80
class StuData extends Student {
	int kor;
	int eng;
	int mat;
	
	StuData(int bun, String name, int age, int kor, int eng, int mat){
		super(bun,name,age);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public void studentPrint() {
		super.studentPrint();
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(mat+"\t");
		System.out.print((kor+eng+mat)+"\t");
		System.out.println(Math.round((kor+eng+mat)*10.0/3)/10.0);
	}

}
