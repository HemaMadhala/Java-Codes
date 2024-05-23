package Recursion;

public class fibonacci {
    public static void fib(int a, int b, int i){
        if(i==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fib(b, c, i-1);
    
    }
}
