import java.math.BigInteger;
import static org.junit.Assert.assertTrue;

public class FibonacciTest{

	@Test
     public void test(){
         int start = 10000;
         BigInteger fib1 = new BigInteger("0");
         BigInteger fib2 = new BigInteger("1");
       
         for(int i = 0; i <= (start -2); i++) {
             BigInteger fib3 = fib1.add(fib2);
             fib1 = fib2;
             fib2 = fib3;
         }
         assertTrue(fib3 > 0);
     }
}