public class Fibonacci{

    public static void main(String []args){
        try{
            int start = Integer.parseInt(args);
            double fib1 = 0;
            double fib2 = 1;
            if(start>=2 && start<47) {
                for(int i=0 ; i<=(start-2); i++) {
                    double fib3 = fib1 + fib2;
                    System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
                    fib1 = fib2;
                    fib2 = fib3;
                }
            } else if(start==1) {
                System.out.println("F"+ start + " = " + fib2 );
            } else if(start==0) {
                System.out.println("F"+ start + " = " + fib1 );
            } else{
                throw new Exception();
            }
        } catch(Exception e) {

        }
    }
    
}