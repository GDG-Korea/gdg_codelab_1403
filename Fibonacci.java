import java.math.BigInteger;

/**
 * 피보나치 수열을 구하는 클래스입니다.
 * 피보나치 수열이 뭔가요? http://ko.wikipedia.org/wiki/%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98_%EC%88%98
 */
public class Fibonacci{
     public static void Print(int index, BigInteger v1, BigInteger v2, BigInteger v3) {
          System.out.println("F"+ index + " = " + v1 + ", F" + (index+1) + " = " + v2 + ", F" + (index+2) + " =  " + v3);
     }

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
             Print(i, fib1, fib2, fib3);
             fib1 = fib2;
             fib2 = fib3;
         }
     }
     public static void print_usage(String progname) {
         String usage = String.format("usage) java %s <number>\n   eg) java %s 5", progname, progname) ;
         System.out.println(usage);
     }
}
