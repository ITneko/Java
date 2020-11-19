package view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

import dao.Tbl_DAO;
import vo.Student_VO;

public class StudentInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tbl_DAO manager = Tbl_DAO.getInstance();
		Student_VO student = null;
		//LocalDate now = LocalDate.now();
		int raw = 0;
		while(true) {
			student = new Student_VO();
			System.out.print("학번: ");
			String hakpattern = "\\d{4}";
			String hakbun = "0";
			while(true) {
				hakbun = sc.next();
				boolean bool = Pattern.matches(hakpattern, hakbun);
				if(bool) {
					System.out.println("ok");
					break;
				}else {
					 System.out.println("숫자 4자리로 입력해주세요.");
				}
			}
			if(hakbun.equals("0000")) break;
			
			System.out.print("성명: ");
			String name = sc.next();
			System.out.print("전화(010-xxxx-xxxx): ");
			String phonepattern = "\\d{3}-\\d{4}-\\d{4}";
			String phone[];
			while(true) {
				String phone2 = sc.next();
				boolean bool = Pattern.matches(phonepattern, phone2);
				if(bool) {
					phone = phone2.split("-");
					break;
				}else {
					System.out.println("입력형식(010-xxxx-xxxx)을 지켜주세요!");
				}
			}
			
			System.out.print("생년월일: ");
			String birth = sc.next();
			String gender = " ";
			while(!gender.equals("M")&&!gender.equals("F")) {
				System.out.print("성별: ");
				gender = sc.next().toUpperCase();
			}
			System.out.print("등록일자(YYYYMMDD): ");
			String regdate = sc.next();
			if(regdate.equals("null")) {
				regdate = "SYSDATE";
			}
			
			student.setHakbun(hakbun);
			student.setName(name);
			student.setPhone1(phone[0]);
			student.setPhone2(phone[1]);
			student.setPhone3(phone[2]);
			student.setBirth(birth);
			student.setGender(gender);
			student.setRegdate(regdate);
			raw = manager.studnetInsert(student);
			if(raw ==1) {
				System.out.println("등록성공!");
			}else {
				System.out.println("등록실패!");
			}
		}
	}

}
