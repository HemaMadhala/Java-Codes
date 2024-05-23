package Recursion;

public class SubSets {
    public static void sub(String s, int idx, String newS){
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }

        char cur=s.charAt(idx);

        sub(s, idx+1, newS+cur);
        sub(s, idx+1, newS);
    }
}
