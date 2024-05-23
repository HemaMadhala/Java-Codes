package Recursion;

public class XpowN {
    public static int xpow(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        int xpown= x * (xpow(x, n-1));
        return xpown;
    }

    // more optimized way

    public static int xpownOpt(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        if(n%2==0){
            return xpownOpt(x, n/2) * xpownOpt(x, n/2);
        }
        else{
            return xpownOpt(x, n/2) * xpownOpt(x, n/2) * x;
        }
    }
}
