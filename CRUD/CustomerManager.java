package CRUD;

import java.util.Scanner;

public class CustomerManager {
	
	//배열에 저장할 수 있는 최대 고객의 수
	static final int MAX = 100; 
	//고객정보를 저장할 변수를 배열로 선언
	static String[] nameList = new String[MAX];//이름 저장
	static char[] genderList = new char[MAX];//성별 저장
	static String[] emailList = new String[MAX];//이메일 저장
	static int[] birthYearList = new int[MAX];//출생년도 저장
	
	//배열은 인덱스를 필요로 함
	static int index = -1;//배열은 0부터 시작하므로 최초 인덱스는 -1이어야 함
	
	//배열은 처음 선언한 크기보다 같거나 적은 개수의 자료를 저장
	//그래서 현재 데이터가 몇 개 저장되어 있는지 알 수 있는 변수 선언
	static int count = 0;//개수
	
	//기본 입력장치로부터 데이터를 입력받기 위해 Scanner객체 생성
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.printf("\n[INFO] 고객 수  : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
		}
	}

}
