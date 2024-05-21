package Palindrome;

public class PalindromeNumber {

    public static boolean palindrome(int x){
        int i=x;
        int reverse=0;
        while(i!=0){
            reverse=(reverse *10)+ i%10;
            i=i/10;
        }

        return reverse==x;
    }
    
}
