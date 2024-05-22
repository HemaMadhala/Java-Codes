package StringReversal;

public class Recursion {
    public static void reverse(String s,int n){
        if (n==0){
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        reverse(s, n-1);
    }
}
