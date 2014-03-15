public class Fibonacci{

     public static void main(String []args){
		
		 isNum(args[0]);
 
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


	 public static void isNum(String str){
	 	if(str.length() < 1){
			System.out.println("숫자를 입력하세요!");
			System.exit(0);
		}
		return;
	 }	


}
