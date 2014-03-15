import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Fibonacci{

	public void test(int n) {
	
		Random r = new Random();
		r.setSeed(10);
        
        BigInteger fib1 = new BigInteger("0");
        BigInteger fib2 = new BigInteger("1");
        BigInteger fib3 = new BigInteger("0");
        
        int start = 0;
        
		for (int e = 0; e < n; e++) {
			start = r.nextInt(100);
			System.out.println("\n\n1 => " + start);
			fib1 = BigInteger.ZERO;
			fib2 = BigInteger.ONE;
			fib3 = BigInteger.ZERO;
			
	        for(int i = 0; i <= (start -2); i++) {
	            fib3 = fib1.add(fib2);
	            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
	            fib1 = fib2;
	            fib2 = fib3;
	        }
		}
   	
	}
	
     public static void main(String []args)
     throws IOException {
    	 
    	 System.out.print("# : ");
    	 BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
    	 String no = bi.readLine();
    	 int n = Integer.parseInt(no);
    	 
    	 Fibonacci f = new Fibonacci();
    	 f.test(n);
    	 
         bi.close();
     }
}