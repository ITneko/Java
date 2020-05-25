package enumEx;


enum Operation { //추상메소드도 구현이 가능
    
   PLUS {double eval(double x , double y){return x +y;}},
   MINUS {double eval(double x , double y){return x -y;}},
   TIMES{double eval(double x , double y){return x *y;}},
   DIVISION {double eval(double x , double y){return x /y;}};
   
   abstract double eval (double x , double y );
   
}



public class EnumEx03 {

   public static void main(String[] args) {

      double x = Double.parseDouble("10.2");
      double y = Double.parseDouble("20.2");
      
      System.out.println(Operation.PLUS.eval(10, 5));
      
      
      for (Operation op : Operation.values()) {
         System.out.printf("%.1f %s %.1f = %.1f%n",x,op,y,op.eval(x, y));
      }
      
   }

}