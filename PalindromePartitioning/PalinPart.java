package PalindromePartitioning;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class PalinPart {

    public List<String> subSet(String s, int i, String newS){
        if(i==s.length()){
            System.out.println(newS);
            return;
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
        List<String> list =new ArrayList<>();
        for(int i=0;i<)
    }
}
