package Palindrome;

public class PalindromeSentence {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z]", "");
        char[] c=s.toCharArray();
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
