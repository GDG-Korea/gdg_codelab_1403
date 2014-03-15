import java.math.BigInteger;

/*************************************************************************
 *  Compilation:  javac Fibonacci.java
 *  Execution:    java Fibonacci N
 *
 *  Computes and prints the first N Fibonacci numbers.
 *  http://en.wikipedia.org/wiki/Fibonacci_number
 *
 *  java Fibonacci 4
 *  F0 = 0, F1 = 1, F2 =  1
 *  F1 = 1, F2 = 1, F3 =  2
 *  F2 = 1, F3 = 2, F4 =  3
 *
 *
 *************************************************************************/

public class Fibonacci{
     public static void main(String []args){
         if (args.length == 0) {
             print_usage(Fibonacci.class.getName());
             return;
         }
         int start = Integer.parseInt(args[0]);
         BigInteger fib1 = new BigInteger("0");
         BigInteger fib2 = new BigInteger("1");
         for(int i = 0; i <= (start -2); i++) {
             BigInteger fib3 = fib1.add(fib2);
             System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
             fib1 = fib2;
             fib2 = fib3;
         }
     }
     public static void print_usage(String progname) {
         String usage = String.format("usage) java %s <number>\n   eg) java %s 5", progname, progname) ;
         System.out.println(usage);
     }
}
