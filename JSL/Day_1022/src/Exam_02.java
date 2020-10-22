class Box<T>{
	T obj;
	Box(T obj){
		this.obj = obj;
	}
}

class AA{
	
}

public class Exam_02 {

	public static void main(String[] args) {
		Box b = new Box(new AA());
		b.obj = new AA();
	}

}
