public class Fibonacci {

    public static void main(String[] args) {
        if( args.length < 1 ) {
            System.out.println("인자가 있어야 합니다.");
            return;
        }
        
        int start = -1;
        try{
            start = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("인자는 숫자로 받아야 합니다.");
            return;
        }

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