package ExceptionHandling_;

public class MemberManager {
	public void insert(Member member) throws DuplicateKeyException{
		System.out.println("고객정보를 저장합니다.");
		System.out.println(member.name + "님의 정보");
		//디비에 홍길동/010-1234-5678 정보가 있다고 치고
		if("홍길동".equals(member.name) && "010-1234-5678".equals(member.phone)) {
			//이 경우에는 디비에 이미 정보가 있는 경우입니다.
			//예외를 발생시켜 insert메서드를 호출한 곳으로
			//데이터가 중복됨을 알려줘야 합니다.
			
			//예외를 강제로 발생시킴
			throw new DuplicateKeyException("데이터가 중복됩니다.");
		}else {
			System.out.println("데이터베이스 저장되었습니다.");
		}
	}

	public static void main(String[] args) {
		
	}

}
