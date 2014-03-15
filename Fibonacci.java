import java.math.BigInteger;

public class Fibonacci{

     public static void main(String []args){
         int start = Integer.parseInt(args[0]);
         BigInteger fib1 = new BigInteger("0");
         System.out.print(new BigInteger("1"));
         BigInteger fib2 = new BigInteger("1");
         for(int i = 0; i <= (start -2); i++) {
             BigInteger fib3 = fib1.add(fib2);
             System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
             fib1 = fib2;
             fib2 = fib3;
         }
     }
}
