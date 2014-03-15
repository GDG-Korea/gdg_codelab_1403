public class Fibonacci{

     public static void main(String []args){
         if(args.length  == 0)
         {
             System.out.println("입력된 수가 없습니다.\n프로그램을 종료합니다.");
             return;
         }

         int start = Integer.parseInt(args[0]);
         int fib1 = 0;
         int fib2 = 1;
         for(int i = 0; i <= (start -2); i++) {
             int fib3 = fib1 + fib2;
             System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
             fib1 = fib2;
             fib2 = fib3;
         }
     }
}