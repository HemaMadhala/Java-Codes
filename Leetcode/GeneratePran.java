package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratePran {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='(') stack.push(')');
            else if(stack.isEmpty() || stack.pop()!=c[i]) return false;
        }
        return stack.isEmpty();
    }
    public static void permu(String s, String per, List<String> list){
        if(s.length()==0){
            if(isValid(per) && !list.contains(per)){
                list.add(per);
            }
        }
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char curr=c[i];
            String news=s.substring(0,i)+s.substring(i+1);
            permu(news, per+curr, list);
        }
    }
    
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        int n=3;
        for(int i=0;i<n;i++){
            sb.append("(");
            sb.append(")");
        }
        System.out.println(sb);
        String s = sb.toString();
        ArrayList<String> list=new ArrayList<>();
        permu(s, "", list);
        System.out.println(list);
    }
}
