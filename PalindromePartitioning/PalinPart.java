package PalindromePartitioning;

import java.util.List;

public class PalinPart {

    public void subSet(String s, int i, String newS){
        if(i==s.length()){
            System.out.println(newS);
            return ;
        }

        char cur=s.charAt(i);
        subSet(s, i+1, newS+cur);
        subSet(s, i+1, newS);
    }

    public boolean isPalindrome(String s){
        char c[]=s.toLowerCase().toCharArray();
        int i=0, j=s.length();
        while(i<j){
            if(c[i]==c[j]){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        return null;
      
    }
}
