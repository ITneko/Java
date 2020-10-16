package example;

public class Sawon implements Comparable<Sawon>{
	private int bun;
	private String name;
	private int age;
	
	public Sawon() {
	}
	public Sawon(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Sawon o) {
		if(bun < o.bun) {
			return -1;
		}else if(bun == o.bun) {
			return 0;
		}else
			return 1;
	}
	
	@Override
	public int hashCode() {
		return bun;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon s = (Sawon)obj;
			System.out.println("이미 등록된 사원입니다.");
			return s.bun==bun;
		}else
			return false;
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
	
	
	
	

}
