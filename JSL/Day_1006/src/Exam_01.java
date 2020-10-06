import java.util.Scanner;

//	2진수 8진수 16진수를 입력받아 진수를 판별하고 10진수로 변환하여 출력?

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값입력: ");
		String strNum = sc.next();
		int num = Integer.parseInt(strNum.substring(2));
		String strNum2 = strNum.substring(2);
		String n1;
		if(strNum.contains("0b")) {
			if(!strNum2.contains("23456789")) {
				System.out.println("잘못된 값입니다!");
				System.exit(1);
			}
			System.out.println("2진수 : " + strNum2);
			num = Integer.parseInt(strNum.substring(2), 2);
		}else if(strNum.contains("0o")) {
			System.out.println("8진수 : " + strNum2);
			num = Integer.parseInt(strNum.substring(2), 8);
		}else if(strNum.contains("0x")){
			System.out.println("16진수 : " + strNum2);
			num = Integer.parseInt(strNum.substring(2), 16);
		}else {
			System.out.println("잘못된 값입니다!");
			System.exit(1);
		}
		System.out.println("10진수 : " + num);
		
	}

}
