package StringReversal;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        String s="cho";
        System.out.println(s);
        System.out.println(reversal(s));
        System.out.println(rev2(s));
        rev3(s);

    }
    public static String reversal(String s) {

        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
    public static String rev2(String s){
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            sb.append(c[i]);
        }
        return sb.toString();

    }
    public static void rev3(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            System.out.print(stack.pop());
        }
    }
}
