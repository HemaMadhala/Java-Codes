package Leetcode;

import java.util.Collections;
import java.util.Stack;

public class ValidaParan {
    public static void main(String[] args) {
        String s = "{[]}";
        ValidaParan v=new ValidaParan();
        System.out.println(v.isValid(s));
    }

    public boolean isValid(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:ch){
            if(c == '{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(c=='('){
                stack.push(')');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
