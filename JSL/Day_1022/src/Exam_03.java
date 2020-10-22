class Person<T,M>{
	private T kind;
	M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Tv{
	
}

class Car{
	
}

public class Exam_03 {

	public static void main(String[] args) {
		Person<Tv, String> p = new Person<Tv,String>();
		p.setKind(new Tv());
		p.setModel("드래곤볼");
		
		System.out.println(p.getKind()+ " " + p.getClass());
		Person<Car, Tv> p2 = new Person<Car,Tv>();
		
		System.out.println(p2.getKind()+ " " + p2.getClass());
	}

}
