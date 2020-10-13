import java.text.MessageFormat;

// ID : xxx		이름 : xxx 	전화 : xxx
public class Exam_04 {

	public static void main(String[] args) {
		String id = "user01";
		String name = "김학생";
		String tel = "010-1111-2222";
		
		String str = "ID :" + id + "\t이름 :" + name + "\t전화 :" + tel;
		System.out.println(str);
		
		String message = "ID : {0} \t이름 : {1} \t전화 : {2}";
		String result = MessageFormat.format(message, id, name, tel);
		System.out.println(result);
		
		
		String msg = "Name : {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
		
		Object[] arguments = {"이자바", "02-123-1234", "27", "07-09"};
		String result2 = MessageFormat.format(msg, arguments);
		System.out.println(result2);
	}

}
