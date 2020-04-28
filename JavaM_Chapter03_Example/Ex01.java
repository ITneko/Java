package JavaM_Chapter03_Example;

//while 문은 반복횟수를 알지 못하는 경우에 이용된다고 했다 .
//while문을 이용하여 -1이 입력될때까지 정수를 계속 입력받아 합을 구하고 평군을 출력하는 프로그램을 작성하라
import java.util.Scanner;

public class Ex01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i, j = 0, sum = 0;
      double avg = 0;
      while (true) {
         System.out.print("정수를 입력하시오(-1을 입력할 경우 종료합니다.)>>");
         i = sc.nextInt();
         j++;
         if (i == -1) {
            avg = (double) sum / j;
            System.out.println("입력한 값의 합:" + sum);
            System.out.printf("입력한 값의 평균 : %.2f", avg);
            break;
         }
         sum += i;

      }
   }
}