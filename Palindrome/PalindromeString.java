package Palindrome;

public class PalindromeString {
    public static boolean palindrome(String s){
        
        char[] c=s.toLowerCase().toCharArray();
        int l=0,r=s.length()-1;
        while (l<r) {
            if(c[l]==c[r]){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
