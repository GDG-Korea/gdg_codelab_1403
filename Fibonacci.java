public class Fibonacci{

     public static void main(String []args){
         int start = Integer.parseInt(args[0]);
         long fib1 = 0;
         long fib2 = 1;
         for(int i = 0; i <= (start -2); i++) {
             long fib3 = fib1 + fib2;
             System.out.println("F"+ i + " = " + Fibonacci.unsigned32(fib1) + ", F" + (i+1) + " = " + Fibonacci.unsigned32(fib2) + ", F" + (i+2) + " =  " + unsigned32(fib3));
             fib1 = fib2;
             fib2 = fib3;
         }
     }

	 public static long unsigned32(long number) {
		 return number & 0xFFFFFFFFL;
	 }
}