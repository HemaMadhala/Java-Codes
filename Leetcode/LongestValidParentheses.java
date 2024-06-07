import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='('){
            stack.add(')');
        }
        else {
            if(stack.isEmpty()){
                continue;
            }
            else if(stack.peek()==')'){
                stack.pop();
            count=count+2;
            }
            else stack.pop();
        }
        }
        return count;
    }
}
