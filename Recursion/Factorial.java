package Recursion;

public class Factorial {
    public static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }

        int fact_nm1= fact(n-1);
        int fact= n * fact_nm1;
        return fact;
    }
}
